package chap05.section4

open class Person {
    constructor(firstName: String) {
        println("[Person] firstName: $firstName")
    }

    constructor(firstName: String, age: Int) {
        println("[Person] firstName: $firstName age: $age")
    }
}


class Developer : Person {

    constructor(firstName: String): this(firstName, 21) {
        println("[Developer] firstName: $firstName")
    }

    constructor(firstName: String, age: Int): super(firstName, age) { // 부모 생성자를 참조한다.
        println("[Developer] firstName: $firstName, age: $age")
    }
}

fun main() {
    val lowell = Developer("Lowell")
}