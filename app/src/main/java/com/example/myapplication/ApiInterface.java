package com.example.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {
    @Headers("sourceId:74")
    @GET("/webapi/classified/stock/?&so=-1&sc=-1&city=26")
    Call<ApiResponse> getCarData(@Query("pn") int page,@Query("stocksFetched") int stocksFetched);
}
