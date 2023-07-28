package com.balu.whatsweather.data.repository

import com.balu.whatsweather.utils.Resource
import com.balu.whatsweather.data.model.CoordinatesResponse
import com.balu.whatsweather.data.model.WeatherResponse
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {

    suspend fun getWeatherData(lat: String, long: String): Flow<Resource<WeatherResponse>>

    suspend fun getCoordinates(cityName: String): Flow<Resource<List<CoordinatesResponse>>>
}