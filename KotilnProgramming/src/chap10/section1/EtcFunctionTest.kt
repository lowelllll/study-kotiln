package chap10.section1

import kotlin.random.Random
import kotlin.system.measureTimeMillis

fun main() {
    // takeIf: 결과가 true면 결과 반환
    // takeUnless: 결과가 false면 결과 반환

    val input = "kotlin"
    val keyword = "in"

    input.indexOf(keyword).takeIf { it >= 0 } ?: error("keyword not found")
    input.indexOf(keyword).takeUnless { it == -1 } ?: error("keyword not found")

    // 시간 측정
    val executionTime = measureTimeMillis {
        for (idx in 1..100) {
             print(idx)
        }
    }
    println()
    println("ExecutionTime: $executionTime ms")

    // 난수생성
    var number = Random.nextInt(100) // 난수 발생 범위
    println(number)
}