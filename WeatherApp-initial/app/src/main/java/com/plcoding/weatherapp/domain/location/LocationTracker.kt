package com.plcoding.weatherapp.domain.location

import android.location.Location

interface LocationTracker {
    //Location is build in the android framework
    suspend fun getCurrentLocation(): Location?
}