package app

fun main() {
    val list = listOf("Eko", "Kurniawan", "Khannedy")

    println(list.getOrNull(5))
    println(list.getOrElse(5) { _ -> "Tidak Ada" })
}