package com.mazurets.currencyconverter.api

import com.mazurets.currencyconverter.util.Constants.Companion.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface ConverterAPI {
    @GET("")
    suspend fun getCurrencyConverter(
        @Query("apiKey")
        apiKey: String = API_KEY
    ) {
    }
}