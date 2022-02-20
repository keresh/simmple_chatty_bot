fun main() {
    val number: Int = readLine()!!.toInt()
    val character: Char = readLine()!!.first()
    println(number.toChar() == character)
}