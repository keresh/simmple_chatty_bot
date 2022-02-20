const val MAX_NEGATIVE = 0

fun main() {
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()
    val n3 = readLine()!!.toInt()
    val s1 = n1 > MAX_NEGATIVE && n2 <= MAX_NEGATIVE && n3 <= MAX_NEGATIVE
    val s2 = n2 > MAX_NEGATIVE && n1 <= MAX_NEGATIVE && n3 <= MAX_NEGATIVE
    val s3 = n3 > MAX_NEGATIVE && n2 <= MAX_NEGATIVE && n1 <= MAX_NEGATIVE

    println(s1 || s2 || s3)
}