package chap07.section2

import sun.net.NetworkServer

class Outer {
    val ov = 5

    class Nested { // static class
        val nv = 10
        fun greeting() = "[Nested] Hello! $nv" // ov에 접근 불가

        fun accessOuter() {
            println(contry) // companion 객체는 접근가능함.
            getSomething()
        }
    }

    fun outside() {
        val msg = Nested().greeting() // 객체 생성 없이 메서드 접근..?? 이게 객체 생성한거 아닌가?
        println("[Outer] $msg, ${Nested().nv}")
    }

    companion object {
        const val contry = "korea"
        fun getSomething() = println("get Somthing.. ")
    }
}

fun main() {
    val output = Outer.Nested().greeting() // outer의 객체를 생성하지 않고 메서드를 접근한다는 소린가?
    println(output)


}