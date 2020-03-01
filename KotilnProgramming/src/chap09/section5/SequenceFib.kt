package chap09.section5

fun main() {
    val fibo = generateSequence(1 to 1) { it.second to it.first + it.second}
            .map { it.first } // 꼬리 재귀

    println(fibo.take(10).toList())
}