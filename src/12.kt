fun main() {
    val number = readLine()!!.toInt()
    val firstDigit = number / 10
    val secondDigit = number % 10
    if (firstDigit > secondDigit) {
        println("Первая цифра больше")
    } else if (secondDigit > firstDigit) {
        println("Вторая цифра больше")
    } else {
        println("Цифры равны")
    }
}