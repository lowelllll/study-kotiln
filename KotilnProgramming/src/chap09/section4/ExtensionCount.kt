package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "kotlin", 33 to "python")

    list.forEach { print("$it") }
    println()
    list.forEachIndexed { index, value -> println("index[$index]: $value") }

    val returnedList = list.onEach { print(it) }
    println()

    val returnedMap = map.onEach { println("Key: ${it.key}, Value: ${it.value}") } // return Map
    println("returnedList: $returnedList")
    println("returnedMap: $returnedMap")

    println(list.count { it % 2 == 0 })

    println(list.max())
    println(list.min())

    println("maxBy:" + map.maxBy { it.key }) // 키 기준으로 최댓값
    println("minBy:" + map.minBy { it.key }) // 키 기준으로 최소값

    // fold: 초깃값과 정해진 식에 따라 처음 요소부터 끝까지 요소에 적용해 값을 반환
    println(list.fold(4) { total, next -> total + next}) // 4 + 1..
    println(list.fold(1) {total, next -> total * next}) // 1 * 1 * 2..

    println(list.foldRight(4) {total, next -> total + next}) // 반대로 적용

    // reduce: fold와 동일하지만 초깃값을 사용하지 않음
    println(list.reduce { total, next -> total + next})

    println(listPair.sumBy { it.second })
}