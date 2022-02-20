import kotlin.math.abs

const val MULTI = 60

fun main() {
    val h1 = readLine()!!.toInt()
    val m1 = readLine()!!.toInt()
    val s1 = readLine()!!.toInt()
    val h2 = readLine()!!.toInt()
    val m2 = readLine()!!.toInt()
    val s2 = readLine()!!.toInt()
    val hoursToSeconds = h1 * MULTI * MULTI
    val minutesTcSeconds = m1 * MULTI
    val hoursToSeconds2 = h2 * MULTI * MULTI
    val minutesTcSeconds2 = m2 * MULTI

    println(
        abs(
            hoursToSeconds + minutesTcSeconds + s1 -
                (hoursToSeconds2 + minutesTcSeconds2 + s2)
        )
    )
}