package com.mazurets.currencyconverter.ui

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiHelper {
    private const val BASE_URL = "https://api.freecurrencyapi.com/"

    fun createApiService(): CurrencyApiService {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(CurrencyApiService::class.java)
    }
}
