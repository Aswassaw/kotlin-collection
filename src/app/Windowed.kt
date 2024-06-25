package app

fun main() {
    val data = (1..5).toList()

    println(data.windowed(3, 1, false))
    println(data.windowed(3, 1, false) { value -> value.size })
    println(data.windowed(3, 1, true))
    println(data.windowed(3, 1, true) { value -> value.size })
    println(data.windowed(3, 2, true))
    println(data.windowed(3, 2, true) { value -> value.size })
}