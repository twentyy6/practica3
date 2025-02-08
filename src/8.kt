fun main() {
    val km = readLine()!!.toDouble()
    val feet = readLine()!!.toDouble()
    val kmToMeters = km * 1000
    val feetToMeters = feet * 0.305

    if (kmToMeters < feetToMeters) {
        println("Расстояние в километрах меньше")
    } else {
        println("Расстояние в футах меньше")
    }
}