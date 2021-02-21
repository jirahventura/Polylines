package com.example.polylines;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


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

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_BACKGROUND_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
        } else if (mMap != null) {
            // Access to the location has been granted to the app.
            mMap.setMyLocationEnabled(true);
        }

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(15.9810, 120.4599);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Jirah's Location"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        //marker of urdaneta
        Marker m1 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(15.980620369721564, 120.56062868579194))
                .anchor(0.5f, 0.5f)
                .title("LOCATION")
                .snippet("Urdaneta's Location"));
        //kimberly 3644306665, 3747488852
        Marker m2 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(16.01391, 120.5148))
                .anchor(0.5f, 0.5f)
                .title("LOCATION")
                .snippet("Kimberly's Location"));
        //marker of Kelvin
        Marker m3 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(15.989640887891403, 119.88118523555515))
                .anchor(0.5f, 0.5f)
                .title("LOCATION")
                .snippet("Kelvin's Location"));
        //Location of mine
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.9810, 120.4599))
                .radius(5000)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));
        //Location of Kimberly
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(16.01391, 120.5148))
                .radius(5000)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));
        //location of Kelvin
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.989640887891403, 119.88118523555515))
                .radius(5000)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));




        //location of urdaneta
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.980620369721564, 120.56062868579194))
                .radius(5000)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));
        //route of Jirah
        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.9810, 120.4599),
                        new LatLng(15.981143949199575,120.46052790038995),
                        new LatLng(15.982241092242758, 120.46019339526285),
                        new LatLng(15.982203259824189, 120.4611182035554),
                        new LatLng(15.983165602362702, 120.46128281254396),
                        new LatLng(15.978685468019044, 120.47380581811936),
                        new LatLng(15.97849436998974, 120.4765887083367),
                        new LatLng(15.97756011042912, 120.48199988358228),
                        new LatLng(15.976052546015948, 120.48968596115982),
                        new LatLng(15.97567034478265, 120.49302101208663),
                        new LatLng(15.978473136826333, 120.5063612155253),
                        new LatLng(15.98189164068504, 120.52239596363546),
                        new LatLng(15.982443691742695, 120.52559849597203),
                        new LatLng(15.981764244095361, 120.52968448541078),
                        new LatLng(15.98036038731727, 120.53518530086704),
                        new LatLng(15.979893262443337, 120.53662091877794),
                        new LatLng(15.978874077099876, 120.53854243816366),
                        new LatLng(15.97517948673245, 120.54561009565175),
                        new LatLng(15.974500014405297, 120.55236854314634),
                        new LatLng(15.974584948570698, 120.55470970466259),
                        new LatLng(15.97507331931486, 120.56018713929852),
                        new LatLng(15.975561688874777, 120.56369888157289),
                        new LatLng(15.979978194248892, 120.56341175799069),
                        new LatLng(15.981804220957681, 120.56014296644892),
                        new LatLng(15.980615182259765, 120.56067304075448))


                .width(10)
                .color(Color.BLUE));
        //route of Kimberly
        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(16.01391,120.5148),
                        new LatLng(16.01127362672286, 120.51569578175952),
                        new LatLng(16.010861120822025, 120.51887151718213),
                        new LatLng(16.011603630829942, 120.52213308329188),
                        new LatLng(16.00978860149155, 120.52625295627257),
                        new LatLng(16.00351837317231, 120.53500768652063),
                        new LatLng(15.990812307225376, 120.54350492454336),
                        new LatLng(15.98726436534676, 120.54882642714344),
                        new LatLng(15.98511906762658, 120.554577083179),
                        new LatLng(15.981741781422286, 120.56011857778283),
                        new LatLng(15.980554074764866, 120.56056415138335))


                .width(10)
                .color(Color.BLUE));
        //route of Kelvin
        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.989640887891403, 119.88118523555515),
                        new LatLng(16.051678790413654, 119.86607903462591),
                        new LatLng(16.08335027155527, 119.90041130946513),
                        new LatLng(16.066195511846054, 119.94572991225293),
                        new LatLng(16.092586836617734, 119.96358269516932),
                        new LatLng(16.146678084426366, 119.98143547808573),
                        new LatLng(16.080711174099346, 120.0226342078928),
                        new LatLng(16.010762338840895, 120.15859001625618),
                        new LatLng(16.00680223687643, 120.23686760288965),
                        new LatLng(16.023962111398394, 120.28081291468388),
                        new LatLng(16.009442313578436, 120.29729240660669),
                        new LatLng(16.02792187290156, 120.32750480846522),
                        new LatLng(16.008122279590072, 120.39067619416942),
                        new LatLng(15.973798335201474, 120.48955314570641),
                        new LatLng(15.987000549575784, 120.52525871153921),
                        new LatLng(15.974214655649561, 120.5544298823384),
                        new LatLng(15.983899907998753, 120.555689195758),
                        new LatLng(15.981788424273153, 120.5601263257649),
                        new LatLng(15.980634027185548, 120.56060840108378))


                .width(10)
                .color(Color.BLUE));




        enableMyLocation();
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setZoomGesturesEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
    }


    public void enableMyLocation() {

    }
}