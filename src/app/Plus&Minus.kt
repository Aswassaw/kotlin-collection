package app

fun main() {
    val fruits = listOf("Apel", "Pepaya", "Pisang")
    val fruits2 = fruits + "Mahoni" + "Jasjus" + listOf("Jeruk", "Pir", "Anggur")
    println(fruits2)
    val fruits3 = fruits - "Apel" - "Pepaya"
    println(fruits3)

    val personalData = mapOf("name" to "Andry", "age" to 21)
    val personalData2 = personalData + Pair("isMarried", false)
    println(personalData2)
    val personalData3 = personalData - "name"
    println(personalData3)
}