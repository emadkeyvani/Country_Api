package com.keyvani.countryapi.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.keyvani.countryapi.repository.HomeRepository
import com.keyvani.countryapi.response.ResponseCountries
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: HomeRepository): ViewModel() {
    val countriesList = MutableLiveData<ResponseCountries>()
    val loading = MutableLiveData<Boolean>()


    fun loadCountriesList() = viewModelScope.launch {
       loading.postValue(true)
        val response = repository.countryList()
        if(response.isSuccessful){
            countriesList.postValue(response.body())
        }
        loading.postValue(false)
    }
}