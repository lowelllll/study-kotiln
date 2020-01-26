package chap06.section3

import sun.lwawt.macosx.CCustomCursor


object OCustomer { // 객체 생성없이 사용, 단일 인스턴스 -> 싱글톤
    // 접근 시점에 객체가 생성됨.
    var name = "yejin"
    fun greeting() = println("Hello Korea")
    val HOBBY = Hobby("listen to music")
    init {
        println("init!")
    }
}

class CCustomer {
    companion object { // static
        const val HELLO = "hello"
        var name = "lowell"
        @JvmField val Hobby = Hobby("Football")
        @JvmStatic fun greeting() = println("Hello World")
    }
}

class Hobby(val name: String)

fun main() {
    OCustomer.greeting()
    OCustomer.name = "dooly"

    println("name = ${OCustomer.name}")

    CCustomer.greeting()
    println("name = ${CCustomer.name}, Hello = ${CCustomer.HELLO}")
    println(CCustomer.Hobby.name)
}