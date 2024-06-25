package app

data class Fruit(val name: String, val quantity: Int)

fun main() {
    val fruits = listOf(
        Fruit("Apple", 10),
        Fruit("Orange", 5),
        Fruit("Banana", 7),
    )

    println(fruits.sortedBy() { fruit -> fruit.name })
    println(fruits.sortedBy() { fruit -> fruit.quantity })

    println(fruits.sortedByDescending() { fruit -> fruit.name })
    println(fruits.sortedByDescending() { fruit -> fruit.quantity })
}