package com.example.appmaps;

import android.content.Context;

import com.google.gson.Gson;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LocationService {
    private static LocationServiceAPI locationServiceApi = null;
    private static Context context;


    public static LocationServiceAPI getLocationService(Context ctx) {

        if (locationServiceApi != null) {
            return locationServiceApi;
        }
        context = ctx;

        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .connectTimeout(1, TimeUnit.MINUTES)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS);

        String url = "http://ip-api.com/json/";


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .client(builder.build())
                .build();
        locationServiceApi = retrofit.create(LocationServiceAPI.class);

        return locationServiceApi;

    }
}