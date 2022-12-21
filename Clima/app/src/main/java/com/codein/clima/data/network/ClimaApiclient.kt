package com.codein.clima.data.network

import com.codein.clima.core.Endpoint
import com.codein.clima.data.model.ClimaRpModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ClimaApiclient {

    @GET(Endpoint.PRONOSTICO)
    suspend fun getAllClima(
        @Path("lat") lat: Double,
        @Path("lon") lon: Double
    ) : Response<ClimaRpModel>

}