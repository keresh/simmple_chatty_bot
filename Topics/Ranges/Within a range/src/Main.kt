fun main() {
    val rangeStart1 = readLine()!!.toInt()
    val rangeEnd1 = readLine()!!.toInt()
    val rangeStart2 = readLine()!!.toInt()
    val rangeEnd2 = readLine()!!.toInt()
    val num = readLine()!!.toInt()
    println(num in rangeStart1..rangeEnd1 || num in rangeStart2..rangeEnd2)
}