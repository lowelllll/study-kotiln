package chap03.section5

fun main() {
    val num = 5
    println("fectorial: $num -> {${fectorial(num)}}")
}

tailrec fun fectorial (n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else fectorial(n-1, run*n)
}