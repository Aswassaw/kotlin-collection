package app

fun main() {
    val list1 = listOf("Andry", "Bagas", "Adi")
    val list2 = listOf("Dev", "Pom", "Wota")

    val list3 = list1.zip(list2)
    println(list3)

    val list4 = list1.zip(list2) { val1, val2 ->
        val1 + "-" + val2
    }
    println(list4)
}