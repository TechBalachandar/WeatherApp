package com.balu.whatsweather.data.remote

import com.balu.whatsweather.data.model.CoordinatesResponse
import com.balu.whatsweather.data.model.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.QueryMap

/**
 * Interface for Retrofit API Calls
 */
interface ApiInterface {

    @GET("/data/2.5/weather")
    suspend fun getWeather(@QueryMap map: Map<String, String>): WeatherResponse

    @GET("/geo/1.0/direct")
    suspend fun getLatAndLong(@QueryMap map: Map<String, String>): List<CoordinatesResponse>

    companion object {
        const val BASE_URL = "https://api.openweathermap.org"
        const val API_KEY = "e2fb27388c8995c0224343417393ec1f"
    }
}