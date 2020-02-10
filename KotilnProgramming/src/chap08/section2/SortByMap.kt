package chap08.section2

fun main() {
    val fruits = arrayOf("banana", "avocado", "apple", "kiwi")

    fruits.filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }

    // 메서드 체이닝

    println(fruits.minBy { it.length })
    println(fruits.maxBy { it.length })
}