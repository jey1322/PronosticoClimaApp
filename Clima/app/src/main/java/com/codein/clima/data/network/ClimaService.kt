package com.codein.clima.data.network

import com.codein.clima.core.RetrofitHelper
import com.codein.clima.data.model.ClimaRpModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ClimaService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getClima() : ClimaRpModel
    {
        return withContext(Dispatchers.IO)
        {
            val response = retrofit.create(ClimaApiclient::class.java).getAllClima(40.416775, -3.703790)
            response.body()!!
        }
    }
}