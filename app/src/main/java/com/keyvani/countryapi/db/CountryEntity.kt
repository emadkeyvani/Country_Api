package com.keyvani.countryapi.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.keyvani.countryapi.utils.Constants

@Entity(tableName = Constants.COUNTRIES_TABLE)
data class CountryEntity(
    @PrimaryKey
    var id: Int = 0,
    var flag: String = "",
    var countryName: String = "",
    var population: Int = 0,
    var ccn3: String = "0",
    var capital: String = ""

)