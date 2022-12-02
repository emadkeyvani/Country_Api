package com.keyvani.countryapi.repository

import com.keyvani.countryapi.db.CountryDao
import com.keyvani.countryapi.db.CountryEntity
import javax.inject.Inject

class RoomRepository @Inject constructor(private val dao: CountryDao) {

    suspend fun insertCountry (entity: CountryEntity) = dao.insertCountry(entity)
    suspend fun deleteCountry (entity: CountryEntity) = dao.deleteCountry(entity)
    suspend fun existsCountry (ccn3:String) = dao.existsCountry(ccn3)
}