package com.keyvani.countryapi.repository

import com.keyvani.countryapi.api.ApiServices
import javax.inject.Inject

class HomeRepository @Inject constructor(private val api:ApiServices) {
    suspend fun countryList()=api.countriesList()
}