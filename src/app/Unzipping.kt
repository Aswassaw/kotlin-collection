package app

fun main() {
    val list = listOf(
        "Api" to "Magma",
        "Angin" to "Badai",
        "Air" to "Banjir"
    )
    println(list)

    val pair: Pair<List<String>, List<String>> = list.unzip()
    println(pair)
}