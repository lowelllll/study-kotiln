package chap11.section3

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
버퍼를 가진 채널 구성
 */
fun main() = runBlocking {
    val channel = Channel<Int>(3) // 버퍼 capacity를 줌
    // 버퍼 크기를 주면 지연 없이 여러개의 요소를 보낼 수 있게됨.

    val sender = launch(coroutineContext) {
        repeat(10) {
            println("Sending $it")
            channel.send(it)
        }
    }

    delay(1000) // 아무것도 받지 않음
    sender.cancel() // 작업 취소
}