const val NUM_ONE = 1
const val NUM_THREE = 3
const val NUM_ZERO = 0
const val NUM_TWO = 2

fun main() {
    var n = readLine()!!.toInt()
    print("$n ")
    while (n != NUM_ONE) {
        if (n % NUM_TWO == NUM_ZERO) {
            n /= NUM_TWO
        } else {
            n = n * NUM_THREE + NUM_ONE
        }
        print("$n ")
    }
}