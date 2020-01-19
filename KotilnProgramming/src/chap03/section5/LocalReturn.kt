package chap03.section5

fun main() {
    shortFunc(3) {
        println("First call: $it")
        return // 인라인 함수에서 사용한 람다식에선 return을 사용할 수 있음.
        // non-local return 비지역 반환
    }
}
