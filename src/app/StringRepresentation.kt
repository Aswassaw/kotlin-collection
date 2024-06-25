package app

fun main() {
    val list: List<String> = listOf("Kucing", "Naga", "Monyet", "Batu", "Planet")

    val string1 = list.joinToString(" ", "Depan-", "-Belakang")
    println(string1)
    val string2 = list.joinToString(" - ") { value -> "(Type $value)" }
    println(string2)

    val builder = StringBuilder()
    list.joinTo(builder, " ", "|", "|")
    list.joinTo(builder, " ", ">", "<")
    list.joinTo(builder, " ", "@", "@")
    val string3 = builder.toString()
    println(string3)
}