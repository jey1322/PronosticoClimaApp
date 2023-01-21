package com.codein.clima.data.network

import com.codein.clima.core.RetrofitHelper
import com.codein.clima.data.model.ClimaRpModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ClimaService {

    private val retrofit = RetrofitHelper.getRetrofit()
    private lateinit var apiclient: ClimaApiclient

    suspend fun getClima(lat: Double, lon: Double): ClimaRpModel
    {
        return withContext(Dispatchers.IO)
        {

            apiclient = retrofit.create(ClimaApiclient::class.java)
            val response = apiclient.getAllClima(lat, lon)
            if (response.isSuccessful)
            {
                response.body()!!
            }
            else
            {
                ClimaRpModel(coord = ClimaRpModel.Coord(), weather = emptyList(), main = ClimaRpModel.Main())
            }

        }

    }
}