package chap05.section5.internal

internal class InternalClass { // 같은 정의의 모듈 내부에서는 접근이 가능함.
    internal var i = 1
    internal fun icFunc() {
        i += 1
    }

    fun access() {
        icFunc()
    }
}

class Other {
    internal val ic = InternalClass() // internal 로 지정
    fun test() {
        ic.i
        ic.icFunc()
    }
}

fun main() {
    val mic = InternalClass()
    mic.i
    mic.icFunc()
}