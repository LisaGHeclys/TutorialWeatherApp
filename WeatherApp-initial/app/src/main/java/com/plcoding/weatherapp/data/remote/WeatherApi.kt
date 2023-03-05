package com.plcoding.weatherapp.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("v1/forecast?hourly=temperature_2m,weathercode,relativehumidity_2m,windspeed_10m,pressure_msl")
    //This is a suspend function that will get the data from the api call above
    suspend fun getWeatherData(
        //This is how we declare the different variable to get from our api call
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double,
    ): WeatherDto
}