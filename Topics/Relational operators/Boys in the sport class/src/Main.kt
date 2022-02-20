fun main() {
    val heightOne = readLine()!!.toInt()
    val heightTwo = readLine()!!.toInt()
    val heightThree = readLine()!!.toInt()

    val isDesceding = heightOne >= heightTwo && heightTwo >= heightThree
    val isAscending = heightOne <= heightTwo && heightTwo <= heightThree
    println(isDesceding || isAscending)
}