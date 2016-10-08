package rz.googlemaps.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

import rz.googlemaps.R;
import rz.googlemaps.model.House;

public class MainActivity extends AppCompatActivity implements MainActivityView, OnMapReadyCallback {

    private MainActivityPresenter presenter = new MainActivityPresenter(this);
    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configureViews();
        presenter.onCreate();


    }

    @Override protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    public void configureViews(){

        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override public void showMarkerOnMap(House house) {

    }

    @Override public void showAllMarkersOnMap(List<House> markers) {

    }

    @Override public void hideMarker() {

    }

    @Override public void hideAllMarkers() {

    }

    @Override public void showRepost() {

    }

    @Override public void onMapReady(GoogleMap googleMap) {
        this.map = googleMap;
        map.addMarker(new MarkerOptions().position(new LatLng(0, 0)));
    }

}
