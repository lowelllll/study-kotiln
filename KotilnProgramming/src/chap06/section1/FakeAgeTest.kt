package chap06.section1

fun main() {
    val lowell = FakeAge()
    lowell.age = 21
    println("lowell is ${lowell.age}")

    val killdong = FakeAge()
    killdong.age = 35
    println("killdong is ${killdong.age}")
}

class FakeAge {
    var age: Int = 0
    set(value) {
        field = when {
            value < 18 -> 18
            value in 18..30 -> value
            else -> value - 3
        }
    }
}