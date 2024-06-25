package app

fun main() {
    val list1 = listOf("Andry", "Pebrianto", "Tampan")
    val list2 = list1.filter { value -> value.length > 5 }
    println(list2)
    val list3 = list1.filterIndexed { index, _ -> index < 1 }
    println(list3)

    val list4: List<Any?> = listOf(null, 1, "Bambang", "Pentek", 2, null)
    val list5 = list4.filterNotNull()
    println(list5)
    val listString = list4.filterIsInstance<String>()
    println(listString)
    val listNull = list4.filter { value -> value == null }
    println(listNull)
}