package com.keyvani.countryapi.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.keyvani.countryapi.repository.ApiRepository
import com.keyvani.countryapi.response.ResponseCountries
import com.keyvani.countryapi.response.ResponseDetail
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ViewModel @Inject constructor(private val apiRepository: ApiRepository) : ViewModel() {
    val countriesList = MutableLiveData<ResponseCountries>()
    val countryDetail = MutableLiveData<List<ResponseDetail>>()
    val isFavorite = MutableLiveData<Boolean>()
    val searchCountry = MutableLiveData<ResponseCountries>()
    val loading = MutableLiveData<Boolean>()
    val empty = MutableLiveData<Boolean>()


    fun loadCountriesList() = viewModelScope.launch {
        loading.postValue(true)
        val response = apiRepository.countryList()
        if (response.isSuccessful) {
            countriesList.postValue(response.body())
        }
        loading.postValue(false)
    }

    fun loadSearchCountry(name: String) = viewModelScope.launch {
        loading.postValue(true)
        val response = apiRepository.searchCountry(name)
        if (response.isSuccessful) {
            searchCountry.postValue(response.body())
            empty.postValue(false)
        } else {
            empty.postValue(true)
        }
        loading.postValue(false)
    }

    fun loadCountryDetail(ccn3: String) = viewModelScope.launch {
        loading.postValue(true)
        val response = apiRepository.countryDetail(ccn3)
        if (response.isSuccessful) {
            countryDetail.postValue(response.body())
        }
        loading.postValue(false)
    }


}