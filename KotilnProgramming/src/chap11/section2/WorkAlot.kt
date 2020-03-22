package chap11.section2

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
    많은 양의 작업 생성
 */
fun main() = runBlocking{
    val jobs = List(100_000) { // 많은 양의 코루틴을 위한 List
        launch {
            delay(10000)
            print(".")
        }
    }

    // 이렇게도 가능
    repeat(100_000) {
        launch {
            delay(1000)
            print("#")
        }
    }

    jobs.forEach{ it.join() } // 모든 job이 완료될 때 까지 기다림.
}