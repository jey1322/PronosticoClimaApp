package com.codein.clima.data.model

import com.google.gson.annotations.SerializedName

data class ClimaRpModel(
    @SerializedName("coord")
    val coord: Coord,

    @SerializedName("weather")
    val weather: List<Weather>,

    @SerializedName("main")
    val main: Main,
)

{
    class Coord
    {
        val lon : Double = 0.0
        val lat : Double = 0.0
    }

    class Weather
    {
        val id : Int = 0
        val main : String = ""
        val description : String = ""
    }

    class Main
    {
        val temp : Double = 0.0
        val feels_like : Double = 0.0
        val temp_min : Double = 0.0
        val temp_max : Double = 0.0
        val pressure : Int = 0
        val humidity : Int = 0
    }
}


