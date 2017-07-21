package tidbits

import Customer.CustomerKot

fun capitalAndPopulation(country: String): Pair<String, Long>{
    return Pair("Madrid", 5200000)
}

fun countryInformation(country: String): Triple<String, String, Long>{
    return Triple("Madrid", "Europe", 52000000)
}

fun main(args: Array<String>){

    val result = capitalAndPopulation("Madrid")

    //println(result.first)
    //println(result.second)

    val countryInfo = countryInformation("Spain")
    countryInfo.third

    val (capital, continent, population) = countryInformation("Madrid")
    val (id, name, email) = CustomerKot(1, "Erhan", "kotlingin@halaylin.com")
    val listCapitalsAndCountries = listOf(Pair("Madrid", "Spain"), "Paris" to "France")

    for ((capital2, country) in listCapitalsAndCountries){
        println("$capital2 - $country")
    }
}