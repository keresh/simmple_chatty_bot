import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = scanner.nextInt()
    var hasReachedBalance = false
    while (scanner.hasNextInt()) {
        val payment = scanner.nextInt()
        if (payment <= balance) {
            balance -= payment
        } else {
            hasReachedBalance = true
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $payment.")
        }
    }
    if (!hasReachedBalance) println("Thank you for choosing us to manage your account! Your balance is $balance.")
}