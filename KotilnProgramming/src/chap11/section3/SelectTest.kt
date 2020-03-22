package chap11.section3

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.selects.select
import java.util.*


fun main() = runBlocking {
    val routine = GlobalScope.produce {
        delay(Random().nextInt(1000).toLong())
        send("A")
    }

    val routine2 = GlobalScope.produce {
        delay(Random().nextInt(1000).toLong())
        send("B")
    }

    // 먼저 수헹된 것을 받음
    val result = select<String> {
        routine.onReceive { result -> result}
        routine2.onReceive { result -> result}
    }

    println("result as $result")
}