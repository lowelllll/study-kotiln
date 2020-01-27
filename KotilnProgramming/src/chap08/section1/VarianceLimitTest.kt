package chap08.section1

open class Animal(val size: Int) {
    fun feed() = println("Feeding...")
}

class Cat(val jump: Int): Animal(50)
class Spider(val poison: Boolean): Animal(1)

// 공변성
class Box<out T: Animal>(val element: T) { // out을 사용하는 경우 val만 허용..
    fun getAnimal(): T = element // out은 반환 자료형에만 사용 가능함.
}

fun main() {
    val c1: Cat = Cat(10)
    val s1: Spider = Spider(true)

    var a1: Animal = c1
    a1 = s1
    println("a1.size: ${a1.size}")

    val c2: Box<Animal> = Box<Cat>(Cat(10)) // 공변성
    println("C2.element.size = ${c2.element.size}")

//    val c3: Box<Cat> = Box<Animal>(10)

}
