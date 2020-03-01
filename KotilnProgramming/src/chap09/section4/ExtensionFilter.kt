package chap09.section4

fun main() {
    val list = listOf(1,2,3,4,5,6)
    val listMixed = listOf(1, "Hello", 3, "World", 5, 'A')
    val listWithNull = listOf(1, null, 3, null, 5, 6)
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)
    val map = mapOf(11 to "Java", 22 to "kotlin", 33 to "python")

    // 짝수만 골라내기
    println(list.filter { it % 2 == 0 })
    // 식 이외에 요소 골라내기
    println(list.filterNot { it % 2 == 0 })
    // null 제외하기
    println(listWithNull.filterNotNull())

    // 인덱스와 함께 추출함
    println("filterIndexed: " + list.filterIndexed { index, value -> index != 1 && value % 2 == 0  })

    // 추출 후 가변형 컬렉션으로 반환함
    val mutList = list.filterIndexedTo(mutableListOf()) { index, value -> index != 1 && value % 2 == 0 }
    println("filterIndexedTo: $mutList")

    // map filter
    println("filterKeys: " + map.filterKeys { it != 11 })
    println("filterValues: " + map.filterValues { it == "Java" })

    // 원하는 자료형만 골라냄
    println("filterIsInstance: " + listMixed.filterIsInstance<String>())

    // 특정 범위 추출하기 (0~2에 해당하는 리스트가 추출됨)
    println("slice: " + list.slice(listOf(0, 1, 2)))

    // 앞에서 요소 2개 반환
    println(list.take(2))
    // 뒤에서 요소 2개 반환
    println(list.takeLast(2))
    // 조건식에 따른 요소 반환
    println(list.takeWhile { it < 3 })

    // 앞에서 특정 요소 제외
    println(list.drop(3))
    // 3 미만을 제외하고 반환
    println(list.dropWhile { it < 3 })
    println(list.dropLastWhile { it < 3 })

    // 3 초과를 제외하고 반환
    println(list.dropLastWhile { it > 3 })
    println(list.dropWhile { it > 3 }) // 음?

    // 각 요소 반환
    println("component1(): " + list.component1())

    // 합집합 (중복 제거)
    println("distinct: " + listRepeated.distinct())

    // 교집합 (중복되는 요소만 보여줌)
    println("intersect: " + listRepeated.intersect(listOf(5, 6, 7, 8)))
}