fun main() {
    val number = readLine()!!.toInt()
    val isEven = number % 2 == 0
    val endsWith7 = number % 10 == 7
    println("Число четное: $isEven")
    println("Число оканчивается на 7: $endsWith7")
}