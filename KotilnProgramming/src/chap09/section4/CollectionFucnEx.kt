package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6) // immutable list

    println(list.map { it * 2 }) // map

    println(list.mapIndexed { index, i -> "$index: $i " }) // enumerate

    println(list.flatMap { listOf(it, 'A') }) // 쭉 펼친다.

    println(listOf("abc", "12").flatMap { it.toList() }) // 각 요소에 식을 적용한 뒤 다시 하나로 합쳐 새로운 컬렉션 반환

    print(list.groupBy { if (it % 2 == 0) "even" else "odd" }) // 주어진 식에 따라 그룹화하고 다시 맵으로 반환함.


    val list1 = listOf(1,2,3)
    println(list1.zip(listOf(5, 6, 7))) // 동일 인덱스 끼리 pair를 만들어 반환함.

}