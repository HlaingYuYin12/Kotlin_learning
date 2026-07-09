fun main() {
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps)

    println("Walking $steps steps burns $caloriesBurned calories.")

}

fun pedometerStepsToCalories(steps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = steps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}