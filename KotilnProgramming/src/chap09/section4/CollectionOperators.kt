package chap09.section4

fun main() {
    val list1: List<String> = listOf("one", "two", "three")
    val list2: List<Int> = listOf(1, 3, 4)

    val map = mapOf("hi" to 1, "hello" to 2, "goodBye" to 3)

    println(list1 + "four")
    println(list2 + 1)
    println(list2 + listOf(5, 6, 7))
    println(list2 - 1)
    println(list2 - listOf(1, 2, 3))
    println(map + Pair("bye", 4))
    println(map - "hello")
    println(map + mapOf("apple" to 4, "orange" to 5))
    println(map - listOf("hi"," hello"))
}