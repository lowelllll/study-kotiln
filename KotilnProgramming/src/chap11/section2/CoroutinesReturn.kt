package chap11.section2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    /*
        GlobalScope
            코루틴의 생명 주기가 프로그램 생명 주기에 의존되므로 main이 종료되면 같이 종료됨
            코루틴을 실행하기 위해선 내부적으로 스레드를 통해 실행될 수 있음.
     */
    val job = GlobalScope.launch { // job 객체 반환
        delay(1000L)
        println("world!")
    }

    println("hello!")
    println("job.isActive: ${job.isActive}, completed: ${job.isCompleted}")
    Thread.sleep(2000L)
    println("job.isActive: ${job.isActive}, completed: ${job.isCompleted}")
}