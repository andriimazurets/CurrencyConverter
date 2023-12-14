package com.mazurets.currencyconverter.models

data class Error(
    val code: Int,
    val info: String,
    val type: String
)