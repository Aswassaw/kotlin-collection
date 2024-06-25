package app

fun <T> displayLisIterator(listIterator: ListIterator<T>) {
    println("Display Next")
    while (listIterator.hasNext()) println(listIterator.next())

    println("Display Prev")
    while (listIterator.hasPrevious()) println(listIterator.previous())
}

fun main() {
    displayLisIterator(listOf("Manusia", "Elf", "Dwarf").listIterator())
}