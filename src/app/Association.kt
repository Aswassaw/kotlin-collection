package app

fun main() {
    val list = listOf("Andry", "Pebrianto", "Ya")

    val map: Map<String, Int> = list.associate { value -> Pair(value, value.length) }
    println(map)

//    hanya mamanipulasi valuenya saja
    val map2: Map<String, Int> = list.associateWith { value -> value.length }
    println(map2)

//    hanya memanipulasi keynya saja
    val map3: Map<Int, String> = list.associateBy { value -> value.length }
    println(map3)
}