package chap11.section2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


private suspend fun doWork1(): String {
    delay(1000)
    return "Work1"
}

private suspend fun doWork2(): String {
    delay(3000)
    return "Work2"
}

/*
    launch 사용
 */
private fun worksInSerial() {
    /*
        순차적 실행
        내부적으로 비동기 코드로 동시에 작동
        코드만 뽀면 순차적으로 실행되는 것 처럼 표현됨. 프로그래밍의 복잡도를 낮춤
     */
    GlobalScope.launch {
        val one = doWork1()
        val two = doWork2()

        println("Kotlin One: $one")
        println("Kotlin Two: $two")
    }
}

/*
    async 사용
 */
private fun workInParallel() {
    val one = GlobalScope.async {
        doWork1()
    }

    val two = GlobalScope.async {
        doWork2()
    }

    GlobalScope.launch {
        // 태스크가 종료되는 시점을 기다렸다가 결과를 받을 수 있도록 await를 사용해 현재 스레드의 블로킹 없이 먼저 종료되면 결과를 가져옴
        val combined = one.await() + "_" + two.await()
        println("Kotlin Combined: $combined")
    }
}

fun main() {
//    worksInSerial()
    workInParallel()
    readLine() // main이 종료되는 것을 방지
}

