package chap06.section1

class User(val id: Int, var name: String, var age: Int) // var 변수에는 getter와 setter가 자동 생성됨.

fun main() {
    val user = User(1, "lowell", 21)

    val name = user.name // getName()

    user.age = 20 // setName()

    println("name: $name, age: ${user.age}")
}