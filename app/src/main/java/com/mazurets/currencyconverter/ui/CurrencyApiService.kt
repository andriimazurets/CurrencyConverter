package com.mazurets.currencyconverter.ui

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApiService {
    @GET("v1/latest")
    fun getExchangeRate(
        @Query("api_key") apiKey: String,
        @Query("base_currency") baseCurrency: String,
        @Query("currencies") currencies: String
    ) : Call<ExchangeRateResponse>
}