package com.optic.goodlike.providers;

import com.optic.goodlike.models.FCMBody;
import com.optic.goodlike.models.FCMResponse;
import com.optic.goodlike.retrofit.IFCMApi;
import com.optic.goodlike.retrofit.RetrofitClient;

import retrofit2.Call;

public class NotificationProvider {

    private String url = "https://fcm.googleapis.com";

    public NotificationProvider() {

    }

    public Call<FCMResponse> sendNotification(FCMBody body) {
        return RetrofitClient.getClient(url).create(IFCMApi.class).send(body);
    }

}
