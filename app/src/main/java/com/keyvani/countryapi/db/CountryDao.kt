package com.keyvani.countryapi.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.keyvani.countryapi.utils.Constants

@Dao
interface CountryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCountry(entity: CountryEntity)

    @Delete
    suspend fun deleteCountry(entity: CountryEntity)

    @Query("SELECT * FROM ${Constants.COUNTRIES_TABLE}")
    fun getAllCountry():MutableList<CountryEntity>

    @Query("SELECT EXISTS (SELECT 1 FROM ${Constants.COUNTRIES_TABLE} WHERE ccn3 = :ccn3)")
    suspend fun existsCountry(ccn3 : String) : Boolean

}