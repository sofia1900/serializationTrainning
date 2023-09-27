package com.iesam.serializationtrainning.app.api

import com.iesam.serializationtrainning.data.AlertApiModel
import com.iesam.serializationtrainning.data.AlertsApiModel
import com.iesam.serializationtrainning.data.PlagueApiModel
import retrofit2.Call
import retrofit2.http.GET


interface ApiService {

    @GET("alerts")
    fun getAlerts(): Call<AlertsApiModel>

    @GET("plagues/1")
    fun getAlertById(): Call<AlertApiModel>

    @GET("plagues")
    fun getPlague(): Call<PlagueApiModel>
}