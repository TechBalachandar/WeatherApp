package com.balu.whatsweather.data.location

import android.location.Location

interface LocationTracker {

    suspend fun getCurrentLocation(): Location?
}