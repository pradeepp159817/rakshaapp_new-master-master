package com.ksemin.raksha.data.model.remote;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {

    @POST("http://kshemin.co.in:3000/")
    @FormUrlEncoded
    Call<POST> savePost(@Field("name") String title,
                        @Field("age") String body,
                        @Field("userId") long userId,
                        @Field ("bloodgroup") String bloodgroup );

}
