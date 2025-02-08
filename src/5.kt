fun main() {
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val c = readLine()!!.toDouble()
    if (a + b > c && a + c > b && b + c > a) {
        println("Треугольник существует")
    } else {
        println("Треугольник не существует")
    }
}