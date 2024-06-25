package app

fun main() {
    val list = listOf("a", "a", "a", "b", "b", "c")
    val grouping = list.groupingBy { it }
    println(grouping)

    println(grouping.eachCount())
    println(grouping.fold("") { accumulator, currentvalue -> accumulator + currentvalue })
}