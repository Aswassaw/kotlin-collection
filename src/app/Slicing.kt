package app

fun main() {
    val list1 = (0..100).toList()
    println(list1)
    val list2 = list1.slice(50..list1.size - 1)
    println(list2)
    val list3 = list1.slice(20..40 step 2)
    println(list3)
    val list4 = list1.slice(40 downTo 20 step 2)
    println(list4)
}