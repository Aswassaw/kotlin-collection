package app

fun main() {
    val mahasiswa = listOf("Bambang", "Budi", "Cecep", "Asep", "Zikar")
    println(mahasiswa.first())
    println(mahasiswa.last())
    println(mahasiswa.elementAt(2))
    println(mahasiswa.elementAtOrNull(10))
    println(mahasiswa.elementAtOrElse(10) { "Gak Ada Bang" })
}