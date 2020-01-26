package chap06.section3

open class Superman() {
    fun work() = println("Taking photos")
    fun talk() = println("Talking with people.")
    open fun fly() = println("Flying in the air.")
}

fun main() {
    val pretendedMan = object: Superman() { // 하위 클래스를 만들지 않고도 오버라이딩
        override fun fly() = println("I am not a real superman. I can not fly!")
    }

    pretendedMan.work()
    pretendedMan.talk()
    pretendedMan.fly()
}