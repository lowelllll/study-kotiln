package chap05.section4

class Animal(
    name: String,
    out: Unit = println("[Primary Constructor] Parameter") // 주 생성자
) {
    val animalName = println("[Property] Animal name: $name") // 프로퍼티 할당

    init{
        println("[init] Animal init block") // 초기화블록
    }

    constructor(name: String, age: Int, out: Unit = println("[Secondary Constructor] Parameter")): this(name) { // this 호춡을 통해 주생성자 -> 프로퍼티 -> 초기화블록 실행됨
        println("[Secondary Constructor] Body: $name, $age")// 부생성자
    }
}

fun main() {
    val a1 = Animal("rabbit", 10)
}