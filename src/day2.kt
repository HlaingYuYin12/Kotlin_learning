fun main() {
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "google chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)


//    String concatenation
    val numberOfAdults = 20
    val numberOfKids = 30
    println("The total party size is: ${numberOfAdults + numberOfKids}")


//    Message formatting
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary(additional bonus).")


//    math operations
//    val firstNumber = 10
//    val secondNumber = 5
//    val result = firstNumber + secondNumber
//    println("$firstNumber + $secondNumber = $result")

    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber )
    val anotherResult = add(firstNumber, thirdNumber)
    val subResult = subtract(thirdNumber, secondNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    println("$thirdNumber - $secondNumber = $subResult")

}

fun add(firstNumber : Int , secondNumber: Int): Int{
    return firstNumber+secondNumber
}

fun subtract(thirdNumber: Int , secondNumber: Int): Int{
    return thirdNumber-secondNumber
}