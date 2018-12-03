package com.example.makarumini.uber_clone.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by MakaruMini on 11/26/18.
 */

public interface IGoogleAPI {
    @GET
    Call<String> getPatch(@Url String url);
}
