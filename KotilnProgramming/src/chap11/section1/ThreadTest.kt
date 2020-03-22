package chap11.section1

/*
    thread 상속
 */
class SimpleThread: Thread() {
    override fun run() {
        println("Current Threads: ${Thread.currentThread()}")
    }
}

/*
    runnable 인터페이스 구현
 */
class SimpleRunnable: Runnable {
    override fun run() {
        println("Current Threads: ${Thread.currentThread()}")
    }
}

fun main() {
    val thread = SimpleThread()
    thread.start()

    val runnable = SimpleRunnable()
    val thread1 = Thread(runnable)
    thread1.start()

    /*
        runnable을 전달
     */
    Thread({ println("Current Threads: ${Thread.currentThread()}")}).start()
}