package rz.googlemaps.ui.main;

import android.telecom.Call;

import java.util.List;
import java.util.concurrent.Callable;

import rz.googlemaps.model.House;

public interface MainActivityView {

    void showMarkerOnMap(House house);

    void showAllMarkersOnMap(List<House> markers);

    void hideMarker();

    void hideAllMarkers();

    void showRepost();

}
