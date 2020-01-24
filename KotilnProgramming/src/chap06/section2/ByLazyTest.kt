package chap06.section2

class LazyTest {
    init {
        println("init block")
    }

    val subject by lazy {
        println("lazy initialized")
        "kotiln Programming" // lazy 반환값
    }

    fun flow() {
        println("not initialized")
        // 프로퍼티에 최초로 접근한 시점에 해당 프로퍼티가 초기화됨.
        println("subject one: $subject") // 최초 초기화
        println("subject two: $subject") // 이미 초기화된 값 사용
    }
}

fun main() {
    val test = LazyTest()
    test.flow()
}