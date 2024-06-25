package app

fun main() {
    listOf("Andry", "Pebrianto").forEach {
        println(it)
    }

    listOf("Elf", "Human", "Dragon", "Wynn").forEachIndexed { index, value ->
        println(index)
        println(value)
    }
}