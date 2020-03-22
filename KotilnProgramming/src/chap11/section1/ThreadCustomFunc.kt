package chap11.section1

public fun thread(start: Boolean = true, isDaemon: Boolean = false, contextClassLoader: ClassLoader? = null,
                  name: String? = null, priority: Int = -1, block: () -> Unit): Thread {
    val thread = object: Thread() {
        override fun run() {
            block()
        }
    }

    thread.let{
        if (isDaemon) it.isDaemon = true // 백그라운드 실행 여부
        if (priority > 0) it.priority = priority
        name?.run { it.name = this }
        contextClassLoader?.run { it.contextClassLoader = this }
        if (start) it.start()

        return it
    }
}

fun main() {
    /*
        쓰레드가 가져야할 옵션 변수를 손쉽게 설정 할 수 있음.
     */
    thread(start = true, name = "lowell-thread") {
        println("current Threads: ${Thread.currentThread()}")
        println("Priority: ${Thread.currentThread().priority}") // default : 5
        println("Name: ${Thread.currentThread().name}")
        println("Daemon: ${Thread.currentThread().isDaemon}") // deamon 서비스는 운영체제에 의해 보통 낮은 우선순위가 부여됨.
    }
}