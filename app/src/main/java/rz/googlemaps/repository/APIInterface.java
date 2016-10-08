package rz.googlemaps.repository;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;
import rz.googlemaps.model.House;

public interface APIInterface {

    @GET("users/{user}/repos")
    Observable<List<House>> listHouses(@Path("user") String user);

}
