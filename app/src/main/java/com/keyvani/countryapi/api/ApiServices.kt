package com.keyvani.countryapi.api

import com.keyvani.countryapi.response.ResponseCountries
import com.keyvani.countryapi.response.ResponseDetail
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServices {

    //https://restcountries.com/v3.1/all
    //https://restcountries.com/v3.1/name/{name}

    @GET("all")
    suspend fun countriesList() : Response<ResponseCountries>

    @GET("alpha/{code}")
    suspend fun detailCountry(@Path("code") code:String) :Response<List<ResponseDetail>>

    @GET("name/{name}")
    suspend fun searchCountry(@Path("name") name:String) :Response<ResponseCountries>





}