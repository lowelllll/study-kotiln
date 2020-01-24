package chap05.section6

class Car(val name: String, val power: String) {
    // 구성관계
    private var engine = Engine(power) // car 객체를 생성함과 동시에 Engine 클래스의 객체도 생성됨.

    fun startEngine() = engine.start()
    fun stopEngine() = engine.stop()
}

class Engine(power: String) {
    fun start() = println("Engine has been started")
    fun stop() = println("Engine has been stopped")
}

fun main() {
    var car = Car("tico", "100hp")
    car.startEngine()
    car.stopEngine()

}