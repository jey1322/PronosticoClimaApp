package com.codein.clima.data.network

import com.codein.clima.core.Endpoint
import com.codein.clima.data.model.ClimaRpModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ClimaApiclient {

    @GET(Endpoint.PRONOSTICO)
    suspend fun getAllClima(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("appid") appid: String = "ce7c1b25bfe959d4b9132dacb3e928d7"
    ): Response<ClimaRpModel>

}