package com.iesam.serializationtrainning.data

import com.iesam.serializationtrainning.app.Either
import com.iesam.serializationtrainning.app.api.ApiClient
import com.iesam.serializationtrainning.app.left
import com.iesam.serializationtrainning.app.right
import com.iesam.serializationtrainning.domain.errors.ErrorApp
import retrofit2.Response
import java.io.IOException

class ApiRemoteDataSource {

    private val apiClient: ApiClient = ApiClient()

    //MODIFICADO
    fun getAlerts(): Either<ErrorApp, AlertsApiModel> {
        try {
            val response: Response<AlertsApiModel> = apiClient.apiService.getAlerts().execute()
            if (response.isSuccessful) {
                return response.body()!!.right()
            } else {
                throw RuntimeException()
            }
        } catch (e: IOException) {
            return ErrorApp.InternetErrorApp.left()
        } catch (e: Exception) {
            return ErrorApp.UnknowErrorApp.left()
        }
    }

    fun getAlert(): Either<ErrorApp, AlertApiModel> {
        try {
            val responseCats: Response<AlertApiModel> = apiClient.apiService.getAlertById().execute()
            if (responseCats.isSuccessful) {
                return responseCats.body()!!.right()
            } else {
                throw RuntimeException()
            }
        } catch (e: IOException) {
            return ErrorApp.InternetErrorApp.left()
        } catch (e: Exception) {
            return ErrorApp.UnknowErrorApp.left()
        }
    }

    fun getPlagues(): Either<ErrorApp, PlagueApiModel> {
        try {
            val response: Response<PlagueApiModel> = apiClient.apiService.getPlague().execute()
            if (response.isSuccessful) {
                return response.body()!!.right()
            } else {
                throw RuntimeException()
            }
        } catch (e: IOException) {
            return ErrorApp.InternetErrorApp.left()
        } catch (e: Exception) {
            return ErrorApp.UnknowErrorApp.left()
        }
    }
}