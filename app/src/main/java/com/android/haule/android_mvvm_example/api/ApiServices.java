package com.android.haule.android_mvvm_example.api;

import com.android.haule.android_mvvm_example.models.ResAnswer;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Hau Le on 2018-10-09.
 */
public interface ApiServices {
    @GET("2.2/answers?order=desc&sort=activity&site=stackoverflow")
    Call<ResAnswer> getListAnswer();
}
