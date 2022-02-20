fun main() {
    val n = readLine()!!.toInt()
    var sum = 0
    repeat(n) {
        val num = readLine()!!.toInt()
        if (num > 0) ++sum
    }
    println(sum)
}