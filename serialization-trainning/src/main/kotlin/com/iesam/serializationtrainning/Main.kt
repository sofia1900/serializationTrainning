package com.iesam.serializationtrainning

import com.iesam.serializationtrainning.data.ApiRemoteDataSource

fun main(){

    val api = ApiRemoteDataSource()
    //Llamada 1.
    //val response1 = api.getAlerts()
    //if(response1.isRight()) println(response1.get())

    //Llamada 2.
    //val response2 = api.getPlagues()
    //if (response2.isRight()) println(response2.get())

    //Llamda 3.
    val response3 = api.getAlert()  //plagues/1
    if (response3.isRight()) println(response3.get())
}