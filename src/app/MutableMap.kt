package app

fun main() {
    val mutableMap: MutableMap<String, String>
    mutableMap = mutableMapOf()
    mutableMap["hp"] = "Samsung S21"
    mutableMap.put("laptop", "Lenovo Thinkpad 21")
    println(mutableMap)

    mutableMap.clear()
    println(mutableMap)

    println(mutableMap.getOrDefault("motor", "Tidak Punya Motor"))
}