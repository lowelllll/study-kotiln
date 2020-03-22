package chap11.section2

val fibonacciSeq = sequence {
    var a = 0
    var b = 1

    yield(1) // 지연 함수 -> 코루틴 생성

    while (true) {
        yield(a + b)
        val tmp = a + b
        a = b
        b = tmp
    }
}

fun main() {
    println(fibonacciSeq.take(8).toList())

    val seq = sequence {
        val start = 0

        yield(start)
        yieldAll(1..5 step 2)
        yieldAll(generateSequence(8) { it * 3}) // 무한한 시퀀스에서 산출
    }

    println(seq.take(9).toList())
}