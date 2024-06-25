package app

fun main() {
    val numbers = (1..100).toList()

    println(numbers.contains(10))
    println(numbers.containsAll(mutableListOf(10, 5, 105)))
}