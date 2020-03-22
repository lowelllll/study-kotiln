package chap11.section4

import chap11.section1.thread

@Volatile private var running = false // 값 쓰기에 대해선 보장하지 않음.
private var count = 0

fun start() {
    running = true
    thread(start = true) {
        while (running) println("${Thread.currentThread()}, count: ${count++}")
    }
}

fun stop() { running = false }

fun main() {
    start()
    start()
    Thread.sleep(10)
    stop()
}