package com.fameless.androiduberriderremake.Remote;

import com.fameless.androiduberriderremake.Model.FCMResponse;
import com.fameless.androiduberriderremake.Model.FCMSendData;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAesw6ccg:APA91bGpzsi3kx3w5Ywtz3k2PjoiFhbvHEcFCx6jaWLzlAf1URM4MwJKittJXehJ82Sn2poYptQkMKYERVm1faMDMfgim8JW3guVBmVKUPe7kz7Kw_7sIsCKnfzllBZwjTBDwMOWqR1a"
    })
    @POST("fcm/send")
    Observable<FCMResponse> sendNotification(@Body FCMSendData body);
}
