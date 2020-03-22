package chap10.section3

import java.util.*

fun main() {
    print("Enter: ")
    val input = readLine()!! // NPE 발생 여부 처리
    println("you entered: $input")

    // 자바 표준 라이브러리 Scanner 사용
    val reader = Scanner(System.`in`)
    var integer: Int = reader.nextInt()
    println("integer: $integer")
}