package com.kdrama.newappkorean.network.apis;

import com.kdrama.newappkorean.models.home_content.AllGenre;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface GenreApi {

    @GET("all_genre")
    Call<List<AllGenre>> getGenre(@Header("API-KEY") String apiKey);


}
