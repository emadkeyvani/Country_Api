package com.keyvani.countryapi.response


import com.google.gson.annotations.SerializedName

class ResponseCountries : ArrayList<ResponseCountries.ResponseCountriesItem>(){
    data class ResponseCountriesItem(
        @SerializedName("altSpellings")
        val altSpellings: List<String?>?,
        @SerializedName("area")
        val area: Double?, // 1285216.0
        @SerializedName("borders")
        val borders: List<String?>?,
        @SerializedName("capital")
        val capital: List<String?>?,
        @SerializedName("capitalInfo")
        val capitalInfo: CapitalInfo?,
        @SerializedName("car")
        val car: Car?,
        @SerializedName("cca2")
        val cca2: String?, // PE
        @SerializedName("cca3")
        val cca3: String?, // PER
        @SerializedName("ccn3")
        val ccn3: String?, // 604
        @SerializedName("cioc")
        val cioc: String?, // PER
        @SerializedName("coatOfArms")
        val coatOfArms: CoatOfArms?,
        @SerializedName("continents")
        val continents: List<String?>?,
        @SerializedName("currencies")
        val currencies: Currencies?,
        @SerializedName("demonyms")
        val demonyms: Demonyms?,
        @SerializedName("fifa")
        val fifa: String?, // PER
        @SerializedName("flag")
        val flag: String?, // 🇵🇪
        @SerializedName("flags")
        val flags: Flags?,
        @SerializedName("gini")
        val gini: Gini?,
        @SerializedName("idd")
        val idd: Idd?,
        @SerializedName("independent")
        val independent: Boolean?, // true
        @SerializedName("landlocked")
        val landlocked: Boolean?, // false
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
        @SerializedName("postalCode")
        val postalCode: PostalCode?,
        @SerializedName("region")
        val region: String?, // Americas
        @SerializedName("startOfWeek")
        val startOfWeek: String?, // monday
        @SerializedName("status")
        val status: String?, // officially-assigned
        @SerializedName("subregion")
        val subregion: String?, // South America
        @SerializedName("timezones")
        val timezones: List<String?>?,
        @SerializedName("tld")
        val tld: List<String?>?,
        @SerializedName("translations")
        val translations: Translations?,
        @SerializedName("unMember")
        val unMember: Boolean? // true
    ) {
        data class CapitalInfo(
            @SerializedName("latlng")
            val latlng: List<Double?>?
        )
    
        data class Car(
            @SerializedName("side")
            val side: String?, // right
            @SerializedName("signs")
            val signs: List<String?>?
        )
    
        data class CoatOfArms(
            @SerializedName("png")
            val png: String?, // https://mainfacts.com/media/images/coats_of_arms/pe.png
            @SerializedName("svg")
            val svg: String? // https://mainfacts.com/media/images/coats_of_arms/pe.svg
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
    
        data class Demonyms(
            @SerializedName("eng")
            val eng: Eng?,
            @SerializedName("fra")
            val fra: Fra?
        ) {
            data class Eng(
                @SerializedName("f")
                val f: String?, // Peruvian
                @SerializedName("m")
                val m: String? // Peruvian
            )
    
            data class Fra(
                @SerializedName("f")
                val f: String?, // Péruvienne
                @SerializedName("m")
                val m: String? // Péruvien
            )
        }
    
        data class Flags(
            @SerializedName("png")
            val png: String?, // https://flagcdn.com/w320/pe.png
            @SerializedName("svg")
            val svg: String? // https://flagcdn.com/pe.svg
        )
    
        data class Gini(
            @SerializedName("2019")
            val x2019: Double? // 41.5
        )
    
        data class Idd(
            @SerializedName("root")
            val root: String?, // +5
            @SerializedName("suffixes")
            val suffixes: List<String?>?
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
            @SerializedName("nativeName")
            val nativeName: NativeName?,
            @SerializedName("official")
            val official: String? // Republic of Peru
        ) {
            data class NativeName(
                @SerializedName("aym")
                val aym: Aym?,
                @SerializedName("que")
                val que: Que?,
                @SerializedName("spa")
                val spa: Spa?
            ) {
                data class Aym(
                    @SerializedName("common")
                    val common: String?, // Piruw
                    @SerializedName("official")
                    val official: String? // Piruw Suyu
                )
    
                data class Que(
                    @SerializedName("common")
                    val common: String?, // Piruw
                    @SerializedName("official")
                    val official: String? // Piruw Ripuwlika
                )
    
                data class Spa(
                    @SerializedName("common")
                    val common: String?, // Perú
                    @SerializedName("official")
                    val official: String? // República del Perú
                )
            }
        }
    
        data class PostalCode(
            @SerializedName("format")
            val format: String?, // #####
            @SerializedName("regex")
            val regex: String? // ^(\d{5})$
        )
    
        data class Translations(
            @SerializedName("ara")
            val ara: Ara?,
            @SerializedName("bre")
            val bre: Bre?,
            @SerializedName("ces")
            val ces: Ces?,
            @SerializedName("cym")
            val cym: Cym?,
            @SerializedName("deu")
            val deu: Deu?,
            @SerializedName("est")
            val est: Est?,
            @SerializedName("fin")
            val fin: Fin?,
            @SerializedName("fra")
            val fra: Fra?,
            @SerializedName("hrv")
            val hrv: Hrv?,
            @SerializedName("hun")
            val hun: Hun?,
            @SerializedName("ita")
            val ita: Ita?,
            @SerializedName("jpn")
            val jpn: Jpn?,
            @SerializedName("kor")
            val kor: Kor?,
            @SerializedName("nld")
            val nld: Nld?,
            @SerializedName("per")
            val per: Per?,
            @SerializedName("pol")
            val pol: Pol?,
            @SerializedName("por")
            val por: Por?,
            @SerializedName("rus")
            val rus: Rus?,
            @SerializedName("slk")
            val slk: Slk?,
            @SerializedName("spa")
            val spa: Spa?,
            @SerializedName("swe")
            val swe: Swe?,
            @SerializedName("tur")
            val tur: Tur?,
            @SerializedName("urd")
            val urd: Urd?,
            @SerializedName("zho")
            val zho: Zho?
        ) {
            data class Ara(
                @SerializedName("common")
                val common: String?, // بيرو
                @SerializedName("official")
                val official: String? // جمهورية بيرو
            )
    
            data class Bre(
                @SerializedName("common")
                val common: String?, // Perou
                @SerializedName("official")
                val official: String? // Republik Perou
            )
    
            data class Ces(
                @SerializedName("common")
                val common: String?, // Peru
                @SerializedName("official")
                val official: String? // Peruánská republika
            )
    
            data class Cym(
                @SerializedName("common")
                val common: String?, // Peru
                @SerializedName("official")
                val official: String? // Republic of Peru
            )
    
            data class Deu(
                @SerializedName("common")
                val common: String?, // Peru
                @SerializedName("official")
                val official: String? // Republik Peru
            )
    
            data class Est(
                @SerializedName("common")
                val common: String?, // Peruu
                @SerializedName("official")
                val official: String? // Peruu Vabariik
            )
    
            data class Fin(
                @SerializedName("common")
                val common: String?, // Peru
                @SerializedName("official")
                val official: String? // Perun tasavalta
            )
    
            data class Fra(
                @SerializedName("common")
                val common: String?, // Pérou
                @SerializedName("official")
                val official: String? // République du Pérou
            )
    
            data class Hrv(
                @SerializedName("common")
                val common: String?, // Peru
                @SerializedName("official")
                val official: String? // Republika Peru
            )
    
            data class Hun(
                @SerializedName("common")
                val common: String?, // Peru
                @SerializedName("official")
                val official: String? // Perui Köztársaság
            )
    
            data class Ita(
                @SerializedName("common")
                val common: String?, // Perù
                @SerializedName("official")
                val official: String? // Repubblica del Perù
            )
    
            data class Jpn(
                @SerializedName("common")
                val common: String?, // ペルー
                @SerializedName("official")
                val official: String? // ペルー共和国
            )
    
            data class Kor(
                @SerializedName("common")
                val common: String?, // 페루
                @SerializedName("official")
                val official: String? // 페루 공화국
            )
    
            data class Nld(
                @SerializedName("common")
                val common: String?, // Peru
                @SerializedName("official")
                val official: String? // Republiek Peru
            )
    
            data class Per(
                @SerializedName("common")
                val common: String?, // پرو
                @SerializedName("official")
                val official: String? // جمهوری پرو
            )
    
            data class Pol(
                @SerializedName("common")
                val common: String?, // Peru
                @SerializedName("official")
                val official: String? // Republika Peru
            )
    
            data class Por(
                @SerializedName("common")
                val common: String?, // Perú
                @SerializedName("official")
                val official: String? // República do Peru
            )
    
            data class Rus(
                @SerializedName("common")
                val common: String?, // Перу
                @SerializedName("official")
                val official: String? // Республика Перу
            )
    
            data class Slk(
                @SerializedName("common")
                val common: String?, // Peru
                @SerializedName("official")
                val official: String? // Peruánska republika
            )
    
            data class Spa(
                @SerializedName("common")
                val common: String?, // Perú
                @SerializedName("official")
                val official: String? // República de Perú
            )
    
            data class Swe(
                @SerializedName("common")
                val common: String?, // Peru
                @SerializedName("official")
                val official: String? // Republiken Peru
            )
    
            data class Tur(
                @SerializedName("common")
                val common: String?, // Peru
                @SerializedName("official")
                val official: String? // Peru Cumhuriyeti
            )
    
            data class Urd(
                @SerializedName("common")
                val common: String?, // پیرو
                @SerializedName("official")
                val official: String? // جمہوریہ پیرو
            )
    
            data class Zho(
                @SerializedName("common")
                val common: String?, // 秘鲁
                @SerializedName("official")
                val official: String? // 秘鲁共和国
            )
        }
    }
}