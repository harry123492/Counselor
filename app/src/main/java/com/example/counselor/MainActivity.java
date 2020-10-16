package com.example.counselor;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
    private FragmentManager fragmentManager;
    private MapFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getFragmentManager();
        mapFragment = (MapFragment)fragmentManager.findFragmentById(R.id.googleMap);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng location = new LatLng(35.152832, 128.104106);// 경상대 정문
        LatLng location2 = new LatLng(35.152411, 128.105758);//스타벅스
        MarkerOptions markerOptions = new MarkerOptions();
        MarkerOptions markerOptions2 = new MarkerOptions();
        markerOptions.title("경상대 정문");
        markerOptions.snippet("우리화이팅합시당");
        markerOptions2.title("경상대 스타벅스");
        markerOptions2.snippet("자바칩프라푸치노");
        markerOptions.position(location);
        markerOptions2.position(location2);
        googleMap.addMarker(markerOptions);
        googleMap.addMarker(markerOptions2);

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 12));
    }
}

