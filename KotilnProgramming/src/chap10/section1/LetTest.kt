package chap10.section1

fun main() {
    val score: Int? = 32

    score?.let { println("Score: $it") } // null일 경우 실행되지 않음.
    val str = score.let { it.toString() }
    println(str)
}