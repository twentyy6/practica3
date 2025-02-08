fun main() {
    val m = readLine()!!.toInt()
    val n = readLine()!!.toInt()
    if (m % n == 0) {
        println("Частное: ${m / n}")
    } else {
        println("$m на $n нацело не делится")
    }
}