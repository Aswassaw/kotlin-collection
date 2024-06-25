package app

fun main() {
    val map: Map<String, String> = mapOf(
        Pair("a", "Andry"),
        "b" to "Bagas",
        "c" to "Caja",
    )
    println(map["a"])
    println(map.entries)
    println(map.values)
    println(map.keys.size)

    for ((key, value) in map) {
        println("$key = $value")
    }
}