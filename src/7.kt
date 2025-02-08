fun main() {
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    println("Большее число: ${maxOf(a, b)}")
    println("Меньшее число: ${minOf(a, b)}")
}