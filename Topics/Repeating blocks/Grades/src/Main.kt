const val D_GRADE = 2
const val C_GRADE = 3
const val B_GRADE = 4
const val A_GRADE = 5

fun main() {
    val n = readLine()!!.toInt()
    var dSum = 0
    var cSum = 0
    var bSum = 0
    var aSum = 0
    repeat(n) {
        val grade = readLine()!!.toInt()
        if (grade == A_GRADE) {
            ++aSum
        } else if (grade == B_GRADE) {
            ++bSum
        } else if (grade == C_GRADE) {
            ++cSum
        } else if (grade == D_GRADE) {
            ++dSum
        }
    }
    println("$dSum $cSum $bSum $aSum")
}