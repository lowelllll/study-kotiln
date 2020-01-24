package chap06.section2

class Person {
    lateinit var name: String

    fun test() {
        if(!::name.isInitialized) {
            println("not initialized")
        } else {
            println("initialized")
        }
    }
}

fun main() {
    val yejin = Person()
    yejin.test()
    yejin.name = "yejin" // 지연 초기화
    yejin.test()
    println(yejin.name)
}