package com.keyvani.countryapi.api

import com.keyvani.countryapi.response.ResponseCountries
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiServices {
    @GET("all")
    suspend fun countriesList() : Response<ResponseCountries>

    @GET("name/{name}")
    suspend fun searchCountry(@Path("name") name:String) :Response<ResponseCountries>
}