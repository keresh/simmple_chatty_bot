import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var count = 0
    do {
        val num = scanner.nextInt()
        count++
    } while (num != 0)
    println(--count)
}