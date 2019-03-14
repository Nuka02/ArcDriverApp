package com.arcproject.arc.Remote;

import com.arcproject.arc.Model.FCMResponse;
import com.arcproject.arc.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAwYD6WJY:APA91bFnraXPI1B4ayLyx17pIM4EnoXpNdpemJdkVPdCzESLHGOphh7WgrMXyJvOUESqguCF9xP0vBYIydmSpk11xX2VaFHtmtkCKgB-7tuxbsGu57qR4grZlWj1ceQoqA4oogqJWILv"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage (@Body Sender body);
}
