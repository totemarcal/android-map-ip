package com.example.appmaps;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface LocationServiceAPI {

    @GET("{ip}")
    Call<ResponseLocation> requestLocationInfo(@Path("ip") String ip);
}