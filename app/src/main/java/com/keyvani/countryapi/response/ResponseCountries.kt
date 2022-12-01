package com.keyvani.countryapi.response


import com.google.gson.annotations.SerializedName

class ResponseCountries : ArrayList<ResponseCountries.ResponseCountriesItem>() {
    data class ResponseCountriesItem(
        @SerializedName("capital")
        val capital: List<String?>?,
        @SerializedName("capitalInfo")
        val capitalInfo: CapitalInfo?,
        @SerializedName("continents")
        val continents: List<String?>?,
        @SerializedName("currencies")
        val currencies: Currencies?,
        @SerializedName("flags")
        val flags: Flags?,
        @SerializedName("languages")
        val languages: Languages?,
        @SerializedName("latlng")
        val latlng: List<Double?>?,
        @SerializedName("maps")
        val maps: Maps?,
        @SerializedName("name")
        val name: Name?,
        @SerializedName("population")
        val population: Int?, // 32971846
        @SerializedName("region")
        val region: String?, // Americas
        @SerializedName("ccn3")
        val ccn3: String?, // Americas
        @SerializedName("status")
        val status: String?, // officially-assigned
    ) {
        data class CapitalInfo(
            @SerializedName("latlng")
            val latlng: List<Double?>?
        )

        data class Currencies(
            @SerializedName("PEN")
            val pEN: PEN?
        ) {
            data class PEN(
                @SerializedName("name")
                val name: String?, // Peruvian sol
                @SerializedName("symbol")
                val symbol: String? // S/ 
            )
        }

        data class Flags(
            @SerializedName("png")
            val png: String?, // https://flagcdn.com/w320/pe.png
            @SerializedName("svg")
            val svg: String? // https://flagcdn.com/pe.svg
        )

        data class Languages(
            @SerializedName("aym")
            val aym: String?, // Aymara
            @SerializedName("que")
            val que: String?, // Quechua
            @SerializedName("spa")
            val spa: String? // Spanish
        )

        data class Maps(
            @SerializedName("googleMaps")
            val googleMaps: String?, // https://goo.gl/maps/uDWEUaXNcZTng1fP6
            @SerializedName("openStreetMaps")
            val openStreetMaps: String? // https://www.openstreetmap.org/relation/288247
        )

        data class Name(
            @SerializedName("common")
            val common: String?, // Peru
            @SerializedName("official")
            val official: String? // Republic of Peru
        )

    }
}
