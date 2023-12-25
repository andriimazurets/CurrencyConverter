package com.mazurets.currencyconverter.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mazurets.currencyconverter.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val apiKey = "fca_live_m2srfYLqp9X4hzs6CdAkiYdUOofs07EjgNiUcMty"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        val apiService = ApiHelper.createApiService()
        val call = apiService.getExchangeRate(apiKey, "USD", "EUR")

        call.enqueue(object : Callback<ExchangeRateResponse> {
            override fun onResponse(
                call: Call<ExchangeRateResponse>,
                response: Response<ExchangeRateResponse>
            ) {
                if (response.isSuccessful) {
                    val exchangeRate = response.body()?.rates?.get("EUR") ?: 0.0
                } else {

                }
            }

            override fun onFailure(call: Call<ExchangeRateResponse>, t: Throwable) {

            }

        })
    }
}