package chap06.section2

import kotlin.properties.Delegates

fun main() {
    var max: Int by Delegates.vetoable(0) { // 프로퍼티 변경 전에 호출됨
        // 컬렉션 같이 큰 데이터를 다룰때 유용함.
        property, oldValue, newValue ->
        newValue > oldValue // 조건에 맞지 않으면 거부권
    }

    println(max)
    max = 10
    println(max)

    max = 5
    println(max) // 5가 재할당되지 않음.
}