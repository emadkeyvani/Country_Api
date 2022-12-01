package com.keyvani.countryapi.response


import com.google.gson.annotations.SerializedName

data class ResponseDetail(
    @SerializedName("altSpellings")
    val altSpellings: List<String?>?,
    @SerializedName("area")
    val area: Double?, // 45227.0
    @SerializedName("borders")
    val borders: List<String?>?,
    @SerializedName("capital")
    val capital: List<String?>?,
    @SerializedName("capitalInfo")
    val capitalInfo: CapitalInfo?,
    @SerializedName("car")
    val car: Car?,
    @SerializedName("cca2")
    val cca2: String?, // EE
    @SerializedName("cca3")
    val cca3: String?, // EST
    @SerializedName("ccn3")
    val ccn3: String?, // 233
    @SerializedName("cioc")
    val cioc: String?, // EST
    @SerializedName("coatOfArms")
    val coatOfArms: CoatOfArms?,
    @SerializedName("continents")
    val continents: List<String?>?,
    @SerializedName("currencies")
    val currencies: Currencies?,
    @SerializedName("demonyms")
    val demonyms: Demonyms?,
    @SerializedName("fifa")
    val fifa: String?, // EST
    @SerializedName("flag")
    val flag: String?, // 🇪🇪
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
    val population: Int?, // 1331057
    @SerializedName("postalCode")
    val postalCode: PostalCode?,
    @SerializedName("region")
    val region: String?, // Europe
    @SerializedName("startOfWeek")
    val startOfWeek: String?, // monday
    @SerializedName("status")
    val status: String?, // officially-assigned
    @SerializedName("subregion")
    val subregion: String?, // Northern Europe
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
        val png: String?, // https://mainfacts.com/media/images/coats_of_arms/ee.png
        @SerializedName("svg")
        val svg: String? // https://mainfacts.com/media/images/coats_of_arms/ee.svg
    )

    data class Currencies(
        @SerializedName("EUR")
        val eUR: EUR?
    ) {
        data class EUR(
            @SerializedName("name")
            val name: String?, // Euro
            @SerializedName("symbol")
            val symbol: String? // €
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
            val f: String?, // Estonian
            @SerializedName("m")
            val m: String? // Estonian
        )

        data class Fra(
            @SerializedName("f")
            val f: String?, // Estonienne
            @SerializedName("m")
            val m: String? // Estonien
        )
    }

    data class Flags(
        @SerializedName("png")
        val png: String?, // https://flagcdn.com/w320/ee.png
        @SerializedName("svg")
        val svg: String? // https://flagcdn.com/ee.svg
    )

    data class Gini(
        @SerializedName("2018")
        val x2018: Double? // 30.3
    )

    data class Idd(
        @SerializedName("root")
        val root: String?, // +3
        @SerializedName("suffixes")
        val suffixes: List<String?>?
    )

    data class Languages(
        @SerializedName("est")
        val est: String? // Estonian
    )

    data class Maps(
        @SerializedName("googleMaps")
        val googleMaps: String?, // https://goo.gl/maps/6SsynwGUodL1sDvq8
        @SerializedName("openStreetMaps")
        val openStreetMaps: String? // https://www.openstreetmap.org/relation/79510
    )

    data class Name(
        @SerializedName("common")
        val common: String?, // Estonia
        @SerializedName("nativeName")
        val nativeName: NativeName?,
        @SerializedName("official")
        val official: String? // Republic of Estonia
    ) {
        data class NativeName(
            @SerializedName("est")
            val est: Est?
        ) {
            data class Est(
                @SerializedName("common")
                val common: String?, // Eesti
                @SerializedName("official")
                val official: String? // Eesti Vabariik
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
            val common: String?, // إستونيا
            @SerializedName("official")
            val official: String? // جمهورية إستونيا
        )

        data class Bre(
            @SerializedName("common")
            val common: String?, // Estonia
            @SerializedName("official")
            val official: String? // Republik Estonia
        )

        data class Ces(
            @SerializedName("common")
            val common: String?, // Estonsko
            @SerializedName("official")
            val official: String? // Estonská republika
        )

        data class Cym(
            @SerializedName("common")
            val common: String?, // Estonia
            @SerializedName("official")
            val official: String? // Gweriniaeth Estonia
        )

        data class Deu(
            @SerializedName("common")
            val common: String?, // Estland
            @SerializedName("official")
            val official: String? // Republik Estland
        )

        data class Est(
            @SerializedName("common")
            val common: String?, // Eesti
            @SerializedName("official")
            val official: String? // Eesti Vabariik
        )

        data class Fin(
            @SerializedName("common")
            val common: String?, // Viro
            @SerializedName("official")
            val official: String? // Viron tasavalta
        )

        data class Fra(
            @SerializedName("common")
            val common: String?, // Estonie
            @SerializedName("official")
            val official: String? // République d'Estonie
        )

        data class Hrv(
            @SerializedName("common")
            val common: String?, // Estonija
            @SerializedName("official")
            val official: String? // Republika Estonija
        )

        data class Hun(
            @SerializedName("common")
            val common: String?, // Észtország
            @SerializedName("official")
            val official: String? // Észt Köztársaság
        )

        data class Ita(
            @SerializedName("common")
            val common: String?, // Estonia
            @SerializedName("official")
            val official: String? // Repubblica di Estonia
        )

        data class Jpn(
            @SerializedName("common")
            val common: String?, // エストニア
            @SerializedName("official")
            val official: String? // エストニア共和国
        )

        data class Kor(
            @SerializedName("common")
            val common: String?, // 에스토니아
            @SerializedName("official")
            val official: String? // 에스토니아 공화국
        )

        data class Nld(
            @SerializedName("common")
            val common: String?, // Estland
            @SerializedName("official")
            val official: String? // Republiek Estland
        )

        data class Per(
            @SerializedName("common")
            val common: String?, // اِستونی
            @SerializedName("official")
            val official: String? // جمهوری استونی
        )

        data class Pol(
            @SerializedName("common")
            val common: String?, // Estonia
            @SerializedName("official")
            val official: String? // Republika Estońska
        )

        data class Por(
            @SerializedName("common")
            val common: String?, // Estónia
            @SerializedName("official")
            val official: String? // República da Estónia
        )

        data class Rus(
            @SerializedName("common")
            val common: String?, // Эстония
            @SerializedName("official")
            val official: String? // Эстонская Республика
        )

        data class Slk(
            @SerializedName("common")
            val common: String?, // Estónsko
            @SerializedName("official")
            val official: String? // Estónska republika
        )

        data class Spa(
            @SerializedName("common")
            val common: String?, // Estonia
            @SerializedName("official")
            val official: String? // República de Estonia
        )

        data class Swe(
            @SerializedName("common")
            val common: String?, // Estland
            @SerializedName("official")
            val official: String? // Republiken Estland
        )

        data class Tur(
            @SerializedName("common")
            val common: String?, // Estonya
            @SerializedName("official")
            val official: String? // Estonya Cumhuriyeti
        )

        data class Urd(
            @SerializedName("common")
            val common: String?, // اسٹونیا
            @SerializedName("official")
            val official: String? // جمہوریہ اسٹونیا
        )

        data class Zho(
            @SerializedName("common")
            val common: String?, // 爱沙尼亚
            @SerializedName("official")
            val official: String? // 爱沙尼亚共和国
        )
    }
}
