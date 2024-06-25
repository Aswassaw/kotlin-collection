package app

fun main() {
    val words = "Lorem Ipsum Dolor Sit Amet Consectectur Adipiscing Elit".split(" ")

    val results = words.filter {
        println("filter $it")
        it.length > 3
    }.map {
        println("map $it")
        it.toUpperCase()
    }.take(4)

    println(results)

    println("===========================================")

    val sequence = words.asSequence()
    val resultSequence = sequence.filter {
        println("filter $it")
        it.length > 3
    }.map {
        println("map $it")
        it.toUpperCase()
    }.take(4)
    println(resultSequence.toList())
}