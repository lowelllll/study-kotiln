package chap11.section2

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

private suspend fun doWork1(): String {
    delay(1000)
    return "Work1"
}

private suspend fun doWork2(): String {
    delay(3000)
    return "Work2"
}

/*
    시작 지점 늦추기
 */
fun main() = runBlocking {
    val time = measureTimeMillis {
        val one = async (start = CoroutineStart.LAZY) { doWork1() }
        val two = async (start = CoroutineStart.LAZY) { doWork2() }
        println("Await: ${one.await() +"_" + two.await()}") // await 함수를 호출하는 시점에서 함수가 실행되도록 작성
    }
    println("completed in $time ms")
}
