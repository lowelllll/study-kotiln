package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100), Pair("D", 200))
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)

    println("elementAt: " + list.elementAt(1))

    // 인덱스를 벗어나는 경우 defualt 값 반환
    // it : index
    println("elementAtOrElse: " + list.elementAtOrElse(10, { 2 * it }))

    println("elementAtOrNull: " + list.elementAtOrNull(10))

    // 식과 일치하는 요소반환
    println("first: " + listPair.first { it.second == 200})
    println("last: " + listPair.last { it.second == 200 })

    println("firstOrNull: " + listPair.firstOrNull { it.first == "E" })
    println("lastOrNull: " + listPair.lastOrNull { it.first == "E" })

    // 주어진 값/식과 일치하는 인덱스 반환
    println("indexOf: " + list.indexOf(4))
    println("lastIndexOf: " + listRepeated.lastIndexOf(5))

    // 일치하는 첫 요소 인덱스반환  없으면 -1
    println("indexOfFirst: " + list.indexOfFirst { it % 2 == 0 })
    println("indexOfLast: " + list.indexOfLast { it % 2 == 0 })

    // 조건식에 일치하는 요소 하나 반환
    println("single: " + listPair.single { it.second == 100})
    println("singleOrNull: " + listPair.singleOrNull { it.second == 500 })

    // 이진탐색
    println("binarySearch: " + list.binarySearch(3))

    // 조건식을 만족하는 첫번째 검색된 요소를 반환. 없으면 null
    println("find: " + list.find { it > 3 } )
}