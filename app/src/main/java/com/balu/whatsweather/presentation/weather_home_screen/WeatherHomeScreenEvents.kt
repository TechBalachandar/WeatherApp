package com.balu.whatsweather.presentation.weather_home_screen

/**
 * Sealed class for Weather Home Screen Events
 */
sealed class WeatherHomeScreenEvents {
    data class OnSearchQueryChange(val query: String) : WeatherHomeScreenEvents()
}