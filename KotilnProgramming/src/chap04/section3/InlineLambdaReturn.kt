package chap04.section3

fun main() {
    retFunc()
}

inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) { // inline으로 선언된 함수에서 람다식을 매개변수로 사용할 시 람다식에서 return 사용 가능
    out(a, b)
}

fun retFunc() {
    println("start of retFunc")
    inlineLambda(1, 3) {a, b ->
        val result = a + b
        if (result > 10) return // 비지역 반환 인라인 함수
        println("result: $result")
    }

    println("end of retFunc")
}