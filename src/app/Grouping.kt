package app

fun main() {
    val list = listOf("a", "b", "a", "a", "c", "d", "d", "d", "a", "b", "c")
    val map: Map<String, List<String>> = list.groupBy { value -> value }
    println(map)

    val grouping = list.groupingBy { value -> value }
    println(grouping)
}