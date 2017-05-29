package com.example.icaro.newmotohelp.Fragment;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.icaro.newmotohelp.BuildConfig;
import com.example.icaro.newmotohelp.Enderecos;
import com.example.icaro.newmotohelp.FireBaseConnection;
import com.example.icaro.newmotohelp.MainActivity;
import com.example.icaro.newmotohelp.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptor;
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

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MapsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MapsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MapsFragment extends Fragment implements OnMapReadyCallback, LocationListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private GoogleMap map;
    LocationManager locationManager;
    //private ProgressDialog progressDialog;
    private OnFragmentInteractionListener mListener;
    private FireBaseConnection conn;
    private ProgressDialog progressDialog;

    public MapsFragment() {

        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MapsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MapsFragment newInstance(String param1, String param2) {
        MapsFragment fragment = new MapsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        locationManager = (LocationManager) getActivity().getSystemService(Context.LOCATION_SERVICE);
        /*locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);*/
        if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            int permissionCheck = ContextCompat.checkSelfPermission(getContext(),
                    Manifest.permission.ACCESS_FINE_LOCATION);
            return;
        }
        //Valida a conexão do network provider
        if(locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)){
            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 1000, 20, new LocationListener() {
                @Override
                public void onLocationChanged(Location location) {
                    //Coleta a latitude
                    double latitude = location.getLatitude();
                    //Coleta a lonngitude
                    double longitude = location.getLongitude();
                    //Inicia a classe LatLng
                    LatLng latLng = new LatLng(latitude, longitude);
                    Geocoder geocoder = new Geocoder(getContext());
                    try {
                        List<Address> AddressList = geocoder.getFromLocation(latitude, longitude, 1);
                        String str = "voce está aqui.";/*AddressList.get(0).getLocality()+",";*/
                        /*str += AddressList.get(0).getCountryName();*/
                        /*map.addMarker(new MarkerOptions().position(latLng).title(str));*/
                        /*map.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,18.0f));*/
                        Marker Marcador = map.addMarker(new MarkerOptions().position(latLng));
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_maps, container, false);

        showProgressDialog();

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        SupportMapFragment fragment = new SupportMapFragment();
        transaction.add(R.id.mapView, fragment);
        transaction.commit();

        fragment.getMapAsync(this);

        return v;


    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

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
    //########### Coordenada usuario
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
    //################33

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
