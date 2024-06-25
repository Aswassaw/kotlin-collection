package app

fun main() {
    val data = (1..100).toList()

    val list1 = data.chunked(10)
    println(list1)
    println(list1.size)

    val list2 = data.chunked(10) { values ->
        var total = 0
        for (value in values) {
            total += value
        }
        total
    }
    println(list2)
}