package com.keyvani.countryapi.repository

import com.keyvani.countryapi.api.ApiServices
import javax.inject.Inject

class ApiRepository @Inject constructor(private val api: ApiServices) {

    suspend fun countryList() = api.countriesList()

    suspend fun countryDetail(code: String) = api.detailCountry(code)

    suspend fun searchCountry(name: String) = api.searchCountry(name)
}