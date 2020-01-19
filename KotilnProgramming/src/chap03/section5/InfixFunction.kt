package chap03.section5

fun main() {
    val multi = 3 multiply 10 // 중위 함수
    println("multi: $multi")
}

infix fun Int.multiply(x: Int): Int {
    return this * x
}