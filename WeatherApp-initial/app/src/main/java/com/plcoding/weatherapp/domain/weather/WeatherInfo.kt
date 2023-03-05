package com.plcoding.weatherapp.domain.weather

//this is where we find an easy way to implement the data/day for the weather
data class WeatherInfo(
    //this is what i'd translate as an array with an (int=0 => today; int=1 => tomorrow) and the List of WeatherData we get from our API
    val weatherDataPerDay: Map<Int, List<WeatherData>>,

    val currentWeatherData: WeatherData?
)
