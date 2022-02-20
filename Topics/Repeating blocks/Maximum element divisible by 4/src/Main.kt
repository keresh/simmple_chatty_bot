const val DIV = 4

fun main() {
    val n = readLine()!!.toInt()
    var max = 0
    repeat(n) {
        val num = readLine()!!.toInt()
        if (num % DIV == 0 && num > max) max = num
    }
    println(max)
}