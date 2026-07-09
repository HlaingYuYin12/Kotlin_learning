fun main() {
//    println("City: Ankara")
//    println("Low temperature: 27, High temperature: 31")
//    println("Chance of rain: 82%")
//    println()
//
//    println("City: Tokyo")
//    println("Low temperature: 32, High temperature: 36")
//    println("Chance of rain: 10%")
//    println()
//
//    println("City: Cape Town")
//    println("Low temperature: 59, High temperature: 64")
//    println("Chance of rain: 2%")
//    println()
//
//    println("City: Guatemala City")
//    println("Low temperature: 50, High temperature: 55")
//    println("Chance of rain: 7%")
//    println()


//    instead of above repetition codes
    println(detailsOfWeather("Ankara", 27, high_temp = 31, chance = 82))
    println(detailsOfWeather("Tokyo", 32, high_temp = 36, chance = 10))
    println(detailsOfWeather("Cape Town", 59, high_temp = 64, chance = 2))
    println(detailsOfWeather("Guatemala City", 50, high_temp = 55, chance = 7))
}

fun detailsOfWeather(city: String, low_temp: Int , high_temp: Int, chance: Int): String {
    return "City: $city\nLow Temperature: $low_temp, High temperature: $high_temp\nChance of rain: $chance%\n"
}