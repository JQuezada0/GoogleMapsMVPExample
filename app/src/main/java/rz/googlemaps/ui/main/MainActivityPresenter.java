package rz.googlemaps.ui.main;

import com.google.gson.Gson;

import java.util.List;

import rx.functions.Action1;
import rz.googlemaps.model.House;
import rz.googlemaps.repository.Repository;

public class MainActivityPresenter {

    private MainActivityView view;
    private Repository repository;

    public MainActivityPresenter(MainActivityView view){
        this.view = view;
        this.repository = new Repository();
    }

    public void onCreate(){
        Gson gson = new Gson();

        String json = "";

        repository.getHouses("user").subscribe(new Action1<List<House>>() {
            @Override public void call(List<House> houses) {
                view.showMarkerOnMap(houses.get(0));
            }
        });

    }

    public void onDestroy(){
        view = null;
        repository = null;
    }

}
