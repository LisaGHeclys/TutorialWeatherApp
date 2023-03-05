package com.plcoding.weatherapp.data.remote

import com.squareup.moshi.Json

data class WeatherDto(
    //dto = data transfer object
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
)