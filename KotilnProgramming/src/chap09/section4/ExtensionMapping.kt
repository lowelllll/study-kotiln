package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listWithNull = listOf(1, null, 3, null, 5, 6)

    // map: 주어진 컬렉션을 전혀 건드리지 않음
    println(list.map { it * 2 })

    val mapIndexed = list.mapIndexed { index, value -> index * value }
    println(mapIndexed)

    // null을 제외한 식에 적용함
    println(listWithNull.mapNotNull { it?.times(2) })

    // flatMap: 각 요소에 식을 적용한 뒤 다시 하나로 합쳐 새로운 컬렉션 반환
    // 요소에 하나씩 적용하고 요소를 펼친다.
    println(list.flatMap { listOf(it, 'A') })
    val result = listOf("abc", "12").flatMap { it.toList() }
    println(result)

    //  주어진 식에 따라 요소를 그룹화 -> 다시 map으로 반환함
    val grpMap = list.groupBy { if (it % 2 == 0) "even" else "odd" }
    println(grpMap)

}