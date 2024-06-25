package app

fun main() {
    val list1 = listOf("Andry", "Bagas", "Adi", "Alung", "Tegar")

    val transform1 = list1.map { item -> "Master ${item.toUpperCase()}" }
    println(transform1)

    val transform2 = list1.mapIndexed { index, item -> "$index - $item" }
    println(transform2)

    val transform3 = list1.mapIndexedNotNull { index, item ->
        if (item !== "Bagas") "$index/$item" else null
    }
    println(transform3[0])
    println(transform3[1])
    println(transform3[2])
    println(transform3[3])

    val mapData = mapOf("name" to "Andry Pebrianto", "age" to 21, "isMarried" to false)
    val transformMapData = mapData.mapValues { value ->
        value
    }
    println(transformMapData)
}