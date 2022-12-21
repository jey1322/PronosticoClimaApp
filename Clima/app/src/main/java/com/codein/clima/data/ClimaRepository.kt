package com.codein.clima.data

import com.codein.clima.data.model.ClimaProvider
import com.codein.clima.data.model.ClimaRpModel
import com.codein.clima.data.network.ClimaService

class ClimaRepository {
    private val api = ClimaService()

    suspend fun getAllClima(lat: Double, lon: Double) : ClimaRpModel
    {
        val response = api.getClima(lat, lon)
        ClimaProvider.clima = response
        return response
    }
}