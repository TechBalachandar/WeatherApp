package com.balu.whatsweather.data.model


data class CoordinatesResponse(
    val name: String,
    val lat: Double,
    val lon: Double,
    val country: String,
    val state: String
)
