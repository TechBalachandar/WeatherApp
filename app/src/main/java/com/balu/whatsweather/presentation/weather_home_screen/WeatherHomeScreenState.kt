package com.balu.whatsweather.presentation.weather_home_screen

import com.balu.whatsweather.data.model.CoordinatesResponse
import com.balu.whatsweather.data.model.WeatherResponse

/**
 * Data class for WeatherHomeScreenState
 */
data class WeatherHomeScreenState(
    val weatherResponse: WeatherResponse? = null,
    val coordinatesResponse: List<CoordinatesResponse>? = null,
    val isLoading: Boolean = false,
    val errorMessage: String? = "",
    val searchQuery: String = ""
)
