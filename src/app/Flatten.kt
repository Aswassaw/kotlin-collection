package app

class Member(val name: String, val hobbies: List<String>)

fun main() {
    val list = listOf(
        listOf("Andry", "Bagas", "Adi"),
        listOf("Andry", "Bagas", "Adi"),
        listOf("Andry", "Bagas", "Adi"),
        listOf("Andry", "Bagas", "Adi")
    )
    println(list.flatten())

    val members = listOf(
        Member("Bambang", listOf("Mancing", "Baca")),
        Member("Baloyskie", listOf("Makan", "berkebun")),
        Member("Pengokoc", listOf("Menonton Biru", "Mengocok Anu"))
    )
    println(members.flatMap { value -> value.hobbies })
}