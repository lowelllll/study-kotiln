package chap06.section2

interface Car{
    fun go(): String
}

class VanImpl(val power: String): Car {
    override fun go(): String = "은 짐을 적재하며 $power 를 가집니다."
}

class SportImpl(val power: String): Car {
    override fun go(): String = "은 경주용에 사용되며 $power 를 가집니다."
}

// ? : 자료형 by 위임자
class CarModel(val model: String, impl: Car): Car by impl { // CarModel은 Car가 가지고 있는 메소드를 가짐
    fun carInfo() {
        println("$model ${go()}") // 참조 없이 각 인터페이스 구현 클래스의 go에 접근
    }
}

fun main() {
    val myDamas = CarModel("Damas 2010", VanImpl("100 마력"))
    val my350z = CarModel("350Z 2008", SportImpl("350 마력"))

    myDamas.carInfo() // 다형성 구현
    my350z.carInfo()
}