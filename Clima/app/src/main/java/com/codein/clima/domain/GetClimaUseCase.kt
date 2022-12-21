package com.codein.clima.domain

import com.codein.clima.data.ClimaRepository

class GetClimaUseCase {
    private val repository = ClimaRepository()

    suspend operator fun invoke(lat: Double, lon: Double) = repository.getAllClima(lat, lon)
}