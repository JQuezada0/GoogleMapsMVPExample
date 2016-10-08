package rz.googlemaps.repository;

import com.google.gson.Gson;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rz.googlemaps.model.House;

public class Repository {

    Retrofit retrofit;
    Gson gson = new Gson();
    APIInterface apiInterface;

    public Repository(){
        this.retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        this.apiInterface = retrofit.create(APIInterface.class);
    }

    public Observable<List<House>> getHouses(String user){
        return apiInterface.listHouses(user);
    }

}
