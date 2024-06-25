package app

fun main() {
    val mutableList: MutableList<String> = mutableListOf()
    println(mutableList)
    println(mutableList.isEmpty())
    mutableList.add("Manusia")
    mutableList.add("Elf")
    mutableList.add("Dwarf")
    println(mutableList)
    mutableList[1] = "Elf King"
    println(mutableList)
    mutableList.remove("Manusia")

    for (item in mutableList) {
        println(item)
    }
}