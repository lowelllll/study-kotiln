package chap11.section2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() { // mainThread
    GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    println("Hello!")
    Thread.sleep(2000L)
}