fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    if (a == b || b == c || a == c) {
        println("Ошибка")
    } else {
        val middle = listOf(a, b, c).sorted()[1]
        println("Среднее число: $middle")
    }
}