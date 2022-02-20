const val SMALL = -1
const val PERFECT = 0
const val LARGE = 1

fun main() {
    val n = readLine()!!.toInt()
    var smallerSum = 0
    var perfectSum = 0
    var largerSum = 0
    repeat(n) {
        val size = readLine()!!.toInt()
        if (size == SMALL) {
            ++smallerSum
        } else if (size == PERFECT) {
            ++perfectSum
        } else if (size == LARGE) {
            ++largerSum
        }
    }
    println("$perfectSum $largerSum $smallerSum")
}