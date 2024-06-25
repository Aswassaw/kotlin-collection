package app

fun main() {
    val numbers = (1..10).toList()

    println(numbers.reduce { accumulator, currentValue -> accumulator + currentValue })
    println(numbers.fold(0) { accumulator, currentValue -> if (currentValue % 2 === 0) accumulator + 1 else accumulator })
}