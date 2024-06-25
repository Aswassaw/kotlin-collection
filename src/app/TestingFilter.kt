package app

fun main() {
    val list = listOf("Apel", "Jeruk", "Mangga")
    println(list.isEmpty())
    println(list.none())
    println(list.isNotEmpty())
    println(list.any())

    println(list.any { value -> value.length > 4 })
    println(list.none { value -> value.length > 4 })
    println(list.all { value -> value.length > 4 })
}