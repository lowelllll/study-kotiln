package chap11.section4

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

//var counter = 0
var counter = AtomicInteger(0) // 원자변수 CPU의 기계어 명령 하나로 컴파일하게됨..


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
//        counter ++
        counter.incrementAndGet()
    }
//    println(counter)
    println(counter.get())
}