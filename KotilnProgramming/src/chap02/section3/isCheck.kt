package chap02.section3

fun main() {
    val num = 256

    if (num is Int) {
        print(num)
    } else {
        print("Not a Int")
    }

    val x: Any // Object 클래스
    x = "Hello"

    if (x is String) {
        println(x.length) // 스마트 캐스트
    }
}
