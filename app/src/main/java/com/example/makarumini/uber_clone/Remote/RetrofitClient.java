package com.example.makarumini.uber_clone.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by MakaruMini on 11/26/18.
 */

public class RetrofitClient {
    public static Retrofit retrofit = null;
    public static Retrofit getClient(String baseUrl){
        if (retrofit==null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
