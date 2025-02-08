fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    if (a % 2 != b % 2) {
        val odd = if (a % 2 != 0) a else b
        println("Нечетное число: $odd")
    } else {
        println("Оба числа имеют одинаковую четность")
    }
}