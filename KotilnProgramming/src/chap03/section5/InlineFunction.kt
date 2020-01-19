package chap03.section5

fun main() {
   shortFunc(3) { println("First call: $it")}
    shortFunc(5) { println("Second call: $it")}

    // shortFunc의 내용이 main에 복사가 됨
}

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}