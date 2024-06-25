package app

fun main() {
    val data = (1..100).toList()

    println(data.first() { it > 10 })
    println(data.last() { it <= 20 })
    println(data.firstOrNull() { it > 110 })
    println(data.lastOrNull() { it <= 1 })
    println(data.find() { it > 89 })
    println(data.findLast() { it > 89 })
}