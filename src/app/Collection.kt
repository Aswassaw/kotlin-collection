package app

fun <T> displayCollection(collection: Collection<T>) {
    for (element in collection) {
        println(element)
    }
}

fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for (element in collection) {
        println(element)
    }
}

fun main() {
    displayCollection(listOf("Andry", "Pebrianto"))
    displayCollection(setOf("Andry", "Pebrianto"))
    displayCollection(mapOf("Andry" to "Pebrianto").entries)

    displayMutableCollection(mutableListOf("Andry", "Pebrianto"))
    displayMutableCollection(mutableSetOf("Andry", "Pebrianto"))
    displayMutableCollection(mutableMapOf("Andry" to "Pebrianto").entries)
}