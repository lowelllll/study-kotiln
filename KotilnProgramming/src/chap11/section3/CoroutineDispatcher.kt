package chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking {
    val jobs = arrayListOf<Job>()

    jobs += launch(Dispatchers.Unconfined) {// 메인 스레드에서 작업
        println("Unconfined: ${Thread.currentThread().name}")
    }
    jobs += launch(coroutineContext) {// 부모의 문맥 -> runBlocking
        println("corotineContext: ${Thread.currentThread().name}")
    }
    jobs += launch(Dispatchers.Default) {// 디스패처 기본 값
        println("Default: ${Thread.currentThread().name}")
    }
    jobs += launch(Dispatchers.IO) { // 입출력 중심 문맥
        println("IO: ${Thread.currentThread().name}")
    }
    jobs += launch {
        println("main runBlocking: ${Thread.currentThread().name}")
    }
    jobs += launch(newSingleThreadContext("MyThread")) { // 새 스레드 생성
        println("MyThread: ${Thread.currentThread().name}")
    }

    jobs.forEach { it.join()}
}