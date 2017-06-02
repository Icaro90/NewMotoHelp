package com.example.icaro.newmotohelp;

import android.*;
import android.Manifest;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.widget.Toast;

import com.example.icaro.newmotohelp.Fragment.MapsFragment;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.example.icaro.newmotohelp.R.id.map;


public class MapsActivity extends SupportMapFragment implements OnMapReadyCallback,
        GoogleMap.OnMapClickListener {


    private GoogleMap mMap;
    GoogleApiClient mGoogleApiClient;
    Marker mCurrLocationMarker;
    private GoogleMap map;
    LocationManager locationManager;
    Marker Marcador;
    Location mLastLocation;
    //private ProgressDialog progressDialog;
    private MapsFragment.OnFragmentInteractionListener mListener;
    private FireBaseConnection conn;
    private ProgressDialog progressDialog;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getMapAsync(this);

        showProgressDialog();
        locationManager = (LocationManager) getActivity().getSystemService(Context.LOCATION_SERVICE);
        /*locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);*/
        if (ActivityCompat.checkSelfPermission(getActivity(), android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getActivity(), android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            int permissionCheck = ContextCompat.checkSelfPermission(getContext(),
                    Manifest.permission.ACCESS_FINE_LOCATION);
            return;
        }
        //Valida a conexão do network provider
        if(locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)){
            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 1000, 20, new LocationListener() {
                @Override
                public void onLocationChanged(Location location) {
                    //Deleta marcador velho1
                    mLastLocation = location;
                    if (Marcador != null) {
                        Marcador.remove();
                    }
                    //Coleta a latitude
                    double latitude = location.getLatitude();
                    //Coleta a lonngitude
                    double longitude = location.getLongitude();
                    //Inicia a classe LatLng
                    LatLng latLng = new LatLng(latitude, longitude);
                    Geocoder geocoder = new Geocoder(getContext().getApplicationContext());
                    try {
                        List<Address> AddressList = geocoder.getFromLocation(latitude, longitude, 1);
                        String str = "voce está aqui.";/*AddressList.get(0).getLocality()+",";*/
                        /*str += AddressList.get(0).getCountryName();*/
                        /*map.addMarker(new MarkerOptions().position(latLng).title(str));*/
                        /*map.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,18.0f));*/
                        Marcador = map.addMarker(new MarkerOptions().position(latLng));
                        Marcador.setTitle(str);
                        Marcador.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_motorcycle_black_48dp));
                        map.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,18.0f));

                        /*if( latLng.latitude != Marcador.()){
                            map.clear();
                            Marcador.setTitle(str);
                            Marcador.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_motorcycle_black_48dp));
                            map.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,18.0f));
                        }*/


                        /*map.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 10.2f));*/
                    } catch (IOException e) {
                    }

                }

                @Override
                public void onStatusChanged(String provider, int status, Bundle extras) {

                }

                @Override
                public void onProviderEnabled(String provider) {

                }

                @Override
                public void onProviderDisabled(String provider) {

                }
            });
        }
        else if(locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)){
            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, new LocationListener() {
                @Override
                public void onLocationChanged(Location location) {

                }

                @Override
                public void onStatusChanged(String provider, int status, Bundle extras) {

                }

                @Override
                public void onProviderEnabled(String provider) {

                }

                @Override
                public void onProviderDisabled(String provider) {

                }
            });
        }

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        if (map != null)
            configMap();
    }

    private void configMap() {
        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        UiSettings mapSettings = map.getUiSettings();

        mapSettings.setAllGesturesEnabled(true);
        mapSettings.setCompassEnabled(true);
        mapSettings.setZoomControlsEnabled(true);

        getEnderecos();
    }

    private void getEnderecos() {
        conn = new FireBaseConnection(getContext());
        conn.get(Enderecos.REFERENCE).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                marcarEnderecos(dataSnapshot);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(getActivity(), "Não foi possível conectar ao banco de dados!", Toast.LENGTH_SHORT).show();

                if (BuildConfig.BUILD_TYPE.equals("debug"))
                    Log.w("Erro", "Failed to read value.", error.toException());
            }
        });
    }

    private void marcarEnderecos(DataSnapshot dataSnapshot) {
        List<Enderecos> pontos = new ArrayList<>();
        for (DataSnapshot dss : dataSnapshot.getChildren()) {
            Enderecos ponto = dss.getValue(Enderecos.class);
            ponto.setId(dss.getKey());
            pontos.add(ponto);
        }

        dismissProgressDialog();

        LatLng local;

        for (Enderecos ponto : pontos) {
            local = new LatLng(ponto.getLat(), ponto.getLng());
            map.addMarker(new MarkerOptions().position(local).title(ponto.getNome()));
            //map.animateCamera(CameraUpdateFactory.newLatLngZoom(local, 10.0f));


        }

        /*map.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(pontos.get(0).getLat(), pontos.get(0).getLng()), 10.0f));*/
        //map.moveCamera(CameraUpdateFactory.newLatLng());
    }
    private void showProgressDialog() {
        progressDialog = new ProgressDialog(getContext());
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setIndeterminate(false);
        progressDialog.setMessage("Conectando ...");
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

    private void dismissProgressDialog() {
        if (progressDialog != null && progressDialog.isShowing())
            progressDialog.dismiss();
    }

    @Override
    public void onMapClick(LatLng latLng) {

    }
}
