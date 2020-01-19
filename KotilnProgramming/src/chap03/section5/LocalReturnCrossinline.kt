package chap03.section5


fun main() {
    shortFunc2(3) {
        println("FirstCall $it")
    }
}

inline fun shortFunc2 (a: Int, crossinline out: (Int) -> Unit) { // 비지역 반환 금지
    println("Before calling out()")
    nestedFunc { out(a) }
    println("After calling out()")
}

fun nestedFunc(body: () -> Unit) {
    body()
}