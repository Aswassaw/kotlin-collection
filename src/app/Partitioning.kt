package app

fun main() {
    val list1 = listOf(
        "John Cruise",
        "Keith Alexander",
        "Little John",
        "Nova Kirsten",
        "Water John Sins",
        "Kinder John Max",
        "Louise Van Merman"
    )
    val (mengandung, tidakMengandung) = list1.partition { value ->
        value.contains("John")
    }
    println(mengandung)
    println(tidakMengandung)
}