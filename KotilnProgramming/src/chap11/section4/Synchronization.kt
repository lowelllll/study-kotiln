package chap11.section4

import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlin.system.measureTimeMillis

var mutex = Mutex() // mutual exclusion (상호배제)
var counter = 0

suspend fun massiveRun(action: suspend () -> Unit) {
    /*
     많은 수의 루틴이 코드에 접근해서 카운트를 증가함
     CPU의 최소 명령어가 마무리 되지 않은 시점에 루틴이 중단되어 다른 루틴이 counter를 건드릴 수 있음
     다른 루틴이 해당 변수를 조작할 수 있기 때문에 값의 무결성을 보장할 수 없게됨
     */
    val n = 1000
    val k = 1000

    val time = measureTimeMillis {
        val jobs = List(n) {
            GlobalScope.launch {
                repeat(k) { action() }
            }
        }
        jobs.forEach { it.join() }
    }

    println("Completed ${n * k} actions in $time ms")
}

fun main() = runBlocking {
    massiveRun {
        mutex.withLock {  // mutex.lock(); try {} finally { mutex.unlock() }
            counter++
        }
    }

    println(counter)
}