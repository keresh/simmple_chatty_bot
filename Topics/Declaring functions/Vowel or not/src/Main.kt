const val VOWELS: String = "aeiou"

fun isVowel(letter: Char): Boolean = letter.lowercaseChar() in VOWELS

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}