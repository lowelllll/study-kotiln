package chap02.section3

fun main() {
    var test: Number = 12.2

    println("$test")

    test = 12

    println("$test")

    test = 120L // long

    println("$test")

    test += 12.0f

    println("$test") // test를 그냥 출력했을때랑 결과가 다름
}