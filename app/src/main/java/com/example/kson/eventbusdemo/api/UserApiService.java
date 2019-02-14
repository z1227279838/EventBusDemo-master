package com.example.kson.eventbusdemo.api;

import com.example.kson.eventbusdemo.bean.UserRegBean;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface UserApiService {
    @POST("small/user/v1/register")
    @FormUrlEncoded
    Call<UserRegBean> register(@Field("phone") String mobile, @Field("pwd") String p);
//    @POST("small/user/v1/register")
//    @FormUrlEncoded
//    Call<UserRegBean> register(@FieldMap HashMap<String,String> params);

    @GET("small/user/v1/register")
    Call<UserRegBean> reg(@Query("phone") String mobile, @Query("pwd") String p);

}
