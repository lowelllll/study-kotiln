package chap09.section4

fun main() {
    val unsortedList = listOf(3, 2, 7, 5)
    // 리스트 뒤집기
    println(unsortedList.reversed())

    // 오름차순 정렬
    println(unsortedList.sorted())
    // 내림차순 정렬
    println(unsortedList.sortedDescending())

    // 특정 비교에 의해 정렬된 컬렉션 반환
    println(unsortedList.sortedBy { it % 3 })
    println(unsortedList.sortedByDescending { it % 3 })
}