package app

class Application(map: Map<String, Any>) {
    val name: String by map
    val version: String by map
}

fun main() {
    val map = mapOf(
        "name" to "Belajar Kotlin Collection",
        "version" to "1.1"
    )

    val application = Application(map)
    println(application.name)
    println(application.version)
}