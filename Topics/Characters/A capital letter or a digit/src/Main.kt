fun main() {
    val ch = readLine()!!.first()
    println(ch.isUpperCase() || ch.isDigit() && ch != '0')
}