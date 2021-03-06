package com.arcproject.arc.Common;

import android.location.Location;

import com.arcproject.arc.Remote.FCMClient;
import com.arcproject.arc.Remote.IFCMService;
import com.arcproject.arc.Remote.IGoogleApi;
import com.arcproject.arc.Remote.RetrofitClient;

public class Common {

    public static final String driver_tbl = "Drivers";
    public static final String user_driver_tbl = "DriversInformation";
    public static final String user_rider_tbl = "RidersInformation";
    public static final String pickup_request_tbl = "PickupRequests";
    public static final String token_tbl = "Tokens";

    public static Location mLastLocation = null;


    public static final String baseURL = "https://maps.googleapis.com";
    public static final String fcmURL = "https://fcm.googleapis.com/";
    public static IGoogleApi getGoogleAPI()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleApi.class);
    }

    public static IFCMService getFCMService()
    {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
}
