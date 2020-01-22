package chap05.section4

fun main() {
    val parrot = Parrot(
        name = "myparrot",
        beak = "short",
        color = "multiple"
    )

    parrot.language = "korean"

    println("Parrot: ${parrot.name}, ${parrot.language}, ${parrot.beak}, ${parrot.color}")
    parrot.sing(5)

}

open class Bird(
    var name: String,
    var wing: Int,
    var beak: String,
    var color: String
) {
    fun fly() = println("Fly wing: $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol") // 오버라이드 가능한 메서드
}

class Parrot(
    name: String,
    wing: Int = 2,
    beak: String,
    color: String,
    var language: String = "natural"
) : Bird(name, wing, beak, color) {

    fun speak() = println("Speak $language")
    override fun sing(vol: Int) {
       println("I am a parrot! The volume level is $vol")
        speak()
    }

}