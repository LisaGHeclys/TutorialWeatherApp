package com.plcoding.weatherapp.presentation

import com.plcoding.weatherapp.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean? = null,
    val error: String? = null,
)
