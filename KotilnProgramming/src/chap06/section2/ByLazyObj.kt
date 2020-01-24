package chap06.section2

class Person2(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false

    val person: Person2 by lazy {
        isPersonInstantiated = true
        Person2("lee", 21) //
    }

    val personDelegate = lazy { Person2("kim", 40) }

    // by lazy, lazy 모두 지연초기화 수행
    // 객체의 프로퍼티나 메서드가 접근되는 시점에 초기화됨.

    println("person init: $isPersonInstantiated")
    println("person personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}") // 초기화
    println("personDelegate.value.name = ${personDelegate.value.name}")

    println("person init: $isPersonInstantiated")
    println("person personDelegate Init: ${personDelegate.isInitialized()}")

}
