package app

fun <T> displayIterator(iterable: Iterable<T>) {
    val iterator = iterable.iterator()
    while (iterator.hasNext()) println(iterator.next())
}

fun main() {
    displayIterator(listOf("Andry", "Pebrianto", "Tampan", "Maksimal"))
}