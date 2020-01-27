package chap07.section1

abstract class Vechicle(val name: String, val color: String, val weight: Double) {

    abstract var maxSpeed: Double // 추상 프로퍼티

    var year = "2020"

    abstract fun start() // 추상 메서드 (하위클래스에서 구현해야함)
    abstract fun stop()

    fun displaySpecs() {
        println("Name: $name, Color: $color, Weight: $weight, Year: $year, Max Speed: $maxSpeed")
    }
}