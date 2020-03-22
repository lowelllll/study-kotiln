package chap11.section2

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 *
 * main() 함수가 코루틴 환경에서 실행됨.
 * main() 함수를 블로킹 모드에서 사용함.
 */
fun main() = runBlocking {
    val job = launch {
        delay(2000)
        println("world!")
    }

    println("hello")
    job.join() // 명시적으로 코루틴이 완료되길 기다림.
}