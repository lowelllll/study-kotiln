package chap09.section5

fun main() {
    val list1 = listOf(1,2,3,4,5)
    val listDefault = list1
            .map { println("map($it)"); it*it } // 새로운 리스트 반환
            .filter { println("filter $it"); it % 2 ==0 }

    println(listDefault)

    val listSeq = list1.asSequence()
            .map { print("map($it)"); it*it }
            .filter { println("filter $it"); it % 2 ==0 }
            .toList() // 이때 모든 연산이 수행됨.

    println(listSeq)

}