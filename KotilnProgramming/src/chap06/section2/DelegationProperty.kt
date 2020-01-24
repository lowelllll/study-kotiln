package chap06.section2

import kotlin.properties.Delegates


class User {
    // 이게 왜 위임이라는건지는 잘 모르겠당...
    var name: String by Delegates.observable("NONAME") { // 프로퍼티 값이 변경된 후 호출됨.
        property, oldValue, newValue ->  // 프로퍼티, 기본값, 새로운 값 지정
        println("$oldValue -> $newValue") // 이벤트가 발생할 때 실행
    }
}

fun main() {
    val user = User()
    user.name = "lowell" // 첫 이벤트 발생
    user.name = "yejin" // 두번째 이벤트 발생
}

