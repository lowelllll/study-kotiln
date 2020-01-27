package chap08.section1

fun <T> add(a: T, b: T, op: (T, T) -> T): T {
    return op(a, b)
}

fun main() {
    val result = add(1, 3, {a, b -> a + b})

    println(result)
}

typealias lambdaType<T> = (T, T) -> T
fun <T> addAux(a: T, b: T, op: lambdaType<T>): T {
    return op(a, b)
} // typealias 사용

