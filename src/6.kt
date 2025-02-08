fun main() {
    val year = readLine()!!.toInt()
    val isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
    val days = if (isLeap) 366 else 365

    println(if (isLeap) "Год високосный, $days дней" else "Год не високосный, $days дней")
}