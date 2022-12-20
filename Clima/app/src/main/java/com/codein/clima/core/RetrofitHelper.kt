package com.codein.clima.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit(): Retrofit
    {
        return Retrofit.Builder()
            .baseUrl(Endpoint.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}