package com.keyvani.countryapi.api

import com.keyvani.countryapi.response.ResponseCountries
import retrofit2.Response
import retrofit2.http.GET

interface ApiServices {
    @GET("all")
    suspend fun countriesList() : Response<ResponseCountries>
}