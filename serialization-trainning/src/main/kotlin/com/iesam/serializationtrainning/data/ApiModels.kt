package com.iesam.serializationtrainning.data

import com.google.gson.annotations.SerializedName


//ALERTS
data class AlertsApiModel (
    @SerializedName("statusCode") val statusCode : Int,
    @SerializedName("data") val data : List<DataAlertsModel>
)

data class DataAlertsModel (
    @SerializedName("alert_id") val alertId : String,
    @SerializedName("title") val title : String,
    @SerializedName("summary") val summary : String,
    @SerializedName("type") val type : String,
    @SerializedName("date") val date : String
)


//PLAGUES
data class PlagueApiModel(
    @SerializedName("statusCode") val statusCode : Int,
    @SerializedName("data") val data : List<DataPlaguesModel>
)

data class DataPlaguesModel (
    @SerializedName("id") val id : String,
    @SerializedName("name") val name : String,
    @SerializedName("url") val url : String,
    @SerializedName("update_at") val updateAt : String
)

// PLAGUE/1
data class AlertApiModel(
    @SerializedName("statusCode") val statusCode : Int,
    @SerializedName("data") val data : Data,
    @SerializedName("name") val name : String?,
    @SerializedName("url") val url : String,
    @SerializedName("update_at") val updateAt : String?
)

data class Data (
    @SerializedName("id") val id : String,
    @SerializedName("plant_id") val plantId : String,
    @SerializedName("name") val name : String,
    @SerializedName("url_source") val urlSource : String,
    @SerializedName("url_image") val urlImage : String?,
    @SerializedName("causal_agent") val causalAgent : String,
    @SerializedName("body") val body : String,
    @SerializedName("images") val images : List<Image>,
    @SerializedName("files") val files : List<File>
)

data class Image (
    @SerializedName("id") val id : String?,
    @SerializedName("plant_id") val plantId : String?,
    @SerializedName("name") val name : String,
    @SerializedName("update_at") val updateAt : String?,
)

data class File (
    @SerializedName("id") val id : String?,
    @SerializedName("plant_id") val plantId : String?,
    @SerializedName("name") val name : String,
    @SerializedName("url") val url : String,
    @SerializedName("update_at") val updateAt : String?,
)

