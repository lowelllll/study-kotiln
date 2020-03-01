package chap09.section4

fun main() {
    val list = listOf(1,2,3,4,5,6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "Python")

    // 모든 요소가 일치하면 true
    println(list.all { it < 10})
    println(list.all { it % 2 == 0 })

    // 하나 이상 요소가 일치하면 true
    println(list.any { it % 2 == 0 })
    println(list.any { it > 10 })

    // 특정 요소가 포함되어있으면 true
    println("contains: " + list.contains(2))
    println(2 in list)
    println(map.contains(11))
    println(11 in map)

    // containsAll 모든 요소가 포함되어있으면 \
    println("containsAll: " + list.containsAll(listOf(1, 2, 3)))

    // 요소가 있는지 확인
    println("none: " + list.none())
    println("none: " + list.none { it > 6}) // 조건을 걸 수도 있음

    println(list.isEmpty())
    println(list.isNotEmpty())
}