package com.example.icaro.newmotohelp;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends SupportMapFragment implements OnMapReadyCallback,
        GoogleMap.OnMapClickListener {

    private GoogleMap mMap;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getMapAsync(this);


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


        mMap = googleMap;
        mMap.setOnMapClickListener(this);
        mMap.getUiSettings().setZoomControlsEnabled(true);

        LatLng cordenadas = new LatLng(-19.5520, -43.5619);
        LatLng cordenadas1 = new LatLng(-19.6910, -43.3610);
        LatLng cordenadas2 = new LatLng(-19.5010, -43.3640);
        LatLng cordenadas3 = new LatLng(-19.6410, -43.3800);
        LatLng cordenadas4 = new LatLng(-19.6510, -43.4610);
        LatLng cordenadas5 = new LatLng(-19.6940, -43.4610);
        /*MarkerOptions marker = new MarkerOptions();
        marker.position(cordenadas);
        marker.title("Borracheiro");
        mMap.addMarker(marker);*/

        mMap.addMarker(new MarkerOptions().position(cordenadas).title("Borracheiro"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cordenadas));
        mMap.addMarker(new MarkerOptions().position(cordenadas1).title("Oficina1"));
        mMap.addMarker(new MarkerOptions().position(cordenadas2).title("Borracheiro2"));
        mMap.addMarker(new MarkerOptions().position(cordenadas3).title("Oficina2"));
        mMap.addMarker(new MarkerOptions().position(cordenadas4).title("Borracheiro3"));
        mMap.addMarker(new MarkerOptions().position(cordenadas5).title("Oficina"));



        // Add a marker in Sydney and move the camera
        /*LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));*/
    }

    @Override
    public void onMapClick(LatLng latLng) {
        Toast.makeText(getContext(), "Coordenadas: " + latLng.toString(),
                Toast.LENGTH_SHORT).show();
    }
}
