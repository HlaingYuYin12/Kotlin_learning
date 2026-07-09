fun main() {

//    default parameters
    val operatingSystem = "Chrome OS"
    val emailId = "hlaingyuyin28@gmail.com"

    println(displayAlertsMessage(operatingSystem, emailId))


//    test2
    val firstUserEmailId = "user_one@gmail.com"
    println(displayAlertMsg(emailId = firstUserEmailId))

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"
    println(displayAlertMsg2(secondUserOperatingSystem, secondUserEmailId))

    val thirdUserOperatingSystem = "Mac Os"
    val thirdUserEmailId = "user_three@gmail.com"
    println(displayAlertMsg2(thirdUserOperatingSystem, thirdUserEmailId))

}
fun displayAlertsMessage(operatingSystem: String, emailId: String): String{
    return "Welcome to $operatingSystem.\n\n\nYou are logged in with $emailId."
}

fun displayAlertMsg(emailId: String): String{
    return "There is a new sign-in request on Unknown OS for your Google Account $emailId."
}

fun displayAlertMsg2(operatingSystem: String, emailId: String): String{
    return "There is a new sign-in request on $operatingSystem for your Google Account $emailId."
}