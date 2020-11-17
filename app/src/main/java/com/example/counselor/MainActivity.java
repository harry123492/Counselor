package com.example.counselor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
    private FragmentManager fragmentManager;
    private MapFragment mapFragment;
    private BottomNavigationView bottomNavigationView;
    private BottomNavigationView bottomNavigationView2;
    private androidx.fragment.app.FragmentManager fm;
    private FragmentTransaction ft;
    private Youth youth;
    private Hearing hearing;
    private Family family;
    private SmokeFree smokeFree;
    private Casino casino;
    private SexualViolence sexualViolence;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.bottommenu);
        bottomNavigationView2 = findViewById(R.id.bottommenu2);

        youth = new Youth();
        hearing = new Hearing();
        family = new Family();
        smokeFree = new SmokeFree();
        casino = new Casino();
        sexualViolence = new SexualViolence();
        setFrag(0);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch(menuItem.getItemId()){
                    case R.id.action_accessible:
                        setFrag(0);
                        break;
                    case R.id.action_family:
                        setFrag(1);
                        break;
                    case R.id.action_build:
                        setFrag(2);
                        break;
                }
                return true;
            }
        });
        bottomNavigationView2.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.action_smokefree:
                        setFrag(3);
                        break;
                    case R.id.action_casino:
                        setFrag(4);
                        break;
                    case R.id.action_sexual_violence:
                        setFrag(5);
                        break;
                }
                return true;
            }
        });


        fragmentManager = getFragmentManager();
        mapFragment = (MapFragment)fragmentManager.findFragmentById(R.id.googleMap);
        mapFragment.getMapAsync(this);
    }

    private void setFrag(int n){
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();


        switch(n){
            case 0:
                ft.replace(R.id.aaaaa, hearing);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.aaaaa, family);
                ft.commit();
                break;
            case 2:
                ft.replace(R.id.aaaaa, youth);
                ft.commit();
                break;
            case 3:
                ft.replace(R.id.aaaaa, smokeFree);
                ft.commit();
                break;
            case 4:
                ft.replace(R.id.aaaaa, casino);
                ft.commit();
                break;
            case 5:
                ft.replace(R.id.aaaaa, sexualViolence);
                ft.commit();
                break;

        }
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        //LatLng currentLocation = new LatLng(latitude, longitude);   // 현재 위치 추가
        LatLng location = new LatLng(35.1741235,128.0959079);// 경남금연지원센터
        LatLng location2 = new LatLng(35.1770869,128.0954964);//경남 서부 해바라기센터
        LatLng location3 = new LatLng(35.1646541,128.1270052);// 두드림 심리상담센터
        LatLng location4 = new LatLng(35.183285,128.0675139);// 미소인 상담센터
        LatLng location5 = new LatLng(35.1549441,128.1092256);// 씨앗과 나무
        LatLng location6 = new LatLng(35.1730956,128.065032);// 인음악 심리상담센터
        LatLng location7 = new LatLng(35.1805242,128.0653256);// 진주시 건강가정 지원센터
        LatLng location8 = new LatLng(35.1931537,128.0796727);// 진주 교육지원청 Wee센터
        LatLng location9 = new LatLng(35.1878638,128.089226);// 진주 심리상담센터
        LatLng location10 = new LatLng(35.1741235,128.0959079);// 진주 중독관리 통합지원센터
        LatLng location11 = new LatLng(35.159548,128.1078828);// 톡톡 심리상담센터
        //MarkerOptions currentMarkerOptions = new MarkerOptions();
        MarkerOptions markerOptions = new MarkerOptions();
        MarkerOptions markerOptions2 = new MarkerOptions();
        MarkerOptions markerOptions3 = new MarkerOptions();
        MarkerOptions markerOptions4 = new MarkerOptions();
        MarkerOptions markerOptions5 = new MarkerOptions();
        MarkerOptions markerOptions6 = new MarkerOptions();
        MarkerOptions markerOptions7 = new MarkerOptions();
        MarkerOptions markerOptions8 = new MarkerOptions();
        MarkerOptions markerOptions9 = new MarkerOptions();
        MarkerOptions markerOptions10 = new MarkerOptions();
        MarkerOptions markerOptions11 = new MarkerOptions();
        //currentMarkerOptions.title("현재 위치");
        markerOptions.title("경남금연지원센터");
        markerOptions.snippet("경상남도진주시주약동407-9 2층");
        markerOptions2.title("경남 서부 해바라기센터");
        markerOptions2.snippet("경상남도진주시칠암동90");
        markerOptions3.title("두드림 심리상담센터");
        markerOptions3.snippet("진주시동부로169번길12 윙스타워a동1205호");
        markerOptions4.title("미소인 상담센터");
        markerOptions4.snippet("진주시진양호로341 2층");
        markerOptions5.title("씨앗과 나무");
        markerOptions5.snippet("진주시개양로6번길24 3층");
        markerOptions6.title("인음악 심리상담센터");
        markerOptions6.snippet("진주시평거로26번길5-12");
        markerOptions7.title("진주시 건강가정 지원센터");
        markerOptions7.snippet("경상남도진주시진양호로305");
        markerOptions8.title("진주 교육지원청 Wee센터");
        markerOptions8.snippet("진주시비봉로23번길8 (중안동)");
        markerOptions9.title("진주 심리상담센터");
        markerOptions9.snippet("35.1878638,128.089226");
        markerOptions10.title("진주 중독관리 통합지원센터");
        markerOptions10.snippet("진주시주약동407-9");
        markerOptions11.title("톡톡 심리상담센터");
        markerOptions11.snippet("진주시동부로1 펄빌딩6층(개양오거리)");

        //currentMarkerOptions.position(currentLocation);
        markerOptions.position(location);
        markerOptions2.position(location2);
        markerOptions3.position(location3);
        markerOptions4.position(location4);
        markerOptions5.position(location5);
        markerOptions6.position(location6);
        markerOptions7.position(location7);
        markerOptions8.position(location8);
        markerOptions9.position(location9);
        markerOptions10.position(location10);
        markerOptions11.position(location11);

        //googleMap.addMarker(currentMarkerOptions);
        googleMap.addMarker(markerOptions);
        googleMap.addMarker(markerOptions2);
        googleMap.addMarker(markerOptions3);
        googleMap.addMarker(markerOptions4);
        googleMap.addMarker(markerOptions5);
        googleMap.addMarker(markerOptions6);
        googleMap.addMarker(markerOptions7);
        googleMap.addMarker(markerOptions8);
        googleMap.addMarker(markerOptions9);
        googleMap.addMarker(markerOptions10);
        googleMap.addMarker(markerOptions11);

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 12));
    }

}

