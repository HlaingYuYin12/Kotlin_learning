//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//fun main() {
//    val name = "Kotlin"
//    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//    // to see how IntelliJ IDEA suggests fixing it.
//    println("Hello, " + name + "!")
//
//    for (i in 1..5) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println("i = $i")
//    }
//}

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
// fun main() {
//     println("Hello, android!!!")
//     println("hi, yu")
// }

// fun test() {
//     println("woot, woot!")
// }

// fun main() {
//     println("1")
//     println("2")
//     println("3")
// }

fun main() {
    println("I'm")
    println("learning")
    println("Kotlin!")

    val count: Int = 2
    println(count)

    val countTest1: Float = 2.5f
    println(countTest1)

    println("You have $count unread messages")
    println("You have $countTest1 unread messages")

    val count1 = 6
    println(count1)

    val unreadCount = 7
    val readCount = 100
    println("You have $unreadCount + $readCount total messages")
    println("You have ${unreadCount + readCount} total messages")

    val totalPhotos = 100
    val deletedPhotos = 10
    println("$totalPhotos photos")
    println("$deletedPhotos photos deleted")
    println("${totalPhotos - deletedPhotos} photos left")

    val cartTotal: Int = 0
    val costs: Int = 20
    println("Val Total: ${cartTotal + costs}")

    var cartTotal1 = 0
    cartTotal1 = 25
    println("Var Total: $cartTotal1")

    var count2: Int = 10
    println("You have $count2 unread messages.")

    count2 = count2 + 1
    println("You have $count2 unread messages.")

    count2++
    println("You have $count2 unread messages.")

    count2--
    println("You have $count2 unread messages.")

    val trip1: Double = 3.20
    val trip2: Double = 4.10
    val trip3: Double = 1.72
//     val totalTripLength: Double = 0.0
//     println("$totalTripLength miles left to destination")

    val totalTripLength: Double = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")

    val nextMeeting = "Next meeting: "
    val date = "Jan 1"
    val reminder = nextMeeting + date + " at work"
    println(reminder)

    print("Say \"hello\"")

    val notificationsEnabled: Boolean = false
    println(notificationsEnabled)


    bdGreeting() //function call

    bdGreeting1() //function call

    val greeting = bdGreeting2() //function call
    println(greeting)
    println(bdGreeting2())

    println(bdGreeting3("Hlaing Yu Yin"))

    println(bdGreeting4("Yu Yin",24))

    println(bdGreeting4(name = "Yuri",age = 13))

    println(bdGreeting5(age = 42))


}
fun bdGreeting() {
    println("Happy Birthday, Yu!")
}

fun bdGreeting1(): Unit {
    println("Happy Birthday, Yu!")
}

fun bdGreeting2(): String{
    val name = "HBD"
    val age = "24 years old"
    return "$name\n$age"
}

fun bdGreeting3(name: String): String{
    val name1 = "Hey guys,I'm $name"
    val age1 = "24+ years old"
    return "$name1\n$age1"
}



fun bdGreeting4(name: String,age: Int): String{
    val name2 = "Hey guys,I'm $name"
    val age2 = "$age years old"
    return "$name2\n$age2"
}

fun bdGreeting5(name: String = "Jimmy",age: Int): String{
    return "Have a nice day,$name .\nYou are now $age years old."
}