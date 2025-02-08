fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    if (a % b == 0) {
        println("$a кратно $b")
    } else {
        println("$a не кратно $b, остаток: ${a % b}")
    }
}