fun main() {
    val number = readln().toInt()
    val digits = number.toString().map { it.toString().toInt() }
    val sumFirstTwo = digits[0] + digits[1]
    val sumLastTwo = digits[2] + digits[3]
    val sumAll = digits.sum()
    val productAll = digits.reduce { acc, i -> acc * i }
    println("Сумма первых двух цифр равна сумме последних двух: ${sumFirstTwo == sumLastTwo}")
    println("Сумма цифр кратна трем: ${sumAll % 3 == 0}")
    println("Произведение цифр кратно четырем: ${productAll % 4 == 0}")
    val a = readln().toInt()
    println("Произведение цифр кратно $a: ${productAll % a == 0}")
}