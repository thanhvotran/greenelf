package com.example.user.greenelf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MoreGPS extends AppCompatActivity {

    private static final LatLng HAMBURG = new LatLng(53.558, 9.927);
    private static final LatLng KIEL = new LatLng(53.551, 9.993);
    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_gps);
//        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
//        Marker hamburg = map.addMarker(new
//                MarkerOptions().position(HAMBURG).title("Hamburg"));
//        Marker kiel = map.addMarker(new
//                MarkerOptions().position(KIEL).title("Kiel").snippet("Kiel is cool")
//                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher)));
//
//        // Move the camera instantly to hamburg with a zoom of 15.
//        map.moveCamera(CameraUpdateFactory.newLatLngZoom(HAMBURG, 15));
//
//        // Zoom in, animating the camera.
//        map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
    }
}
