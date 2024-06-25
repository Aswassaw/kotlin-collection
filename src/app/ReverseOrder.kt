package app

fun main() {
    val numbers = mutableListOf(2,5,4,1,3)
    println(numbers.sortedDescending())
    println(numbers.sorted().reversed())

    val numbers2 = numbers.asReversed()
    numbers.add(10)
    println(numbers2)

    numbers2.add(100)
    println(numbers)
}