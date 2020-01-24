package chap06.section1

class CustomUser(_id: Int, _name: String, _age: Int) {
    val id: Int = _id

    var name: String = _name
    private set(value) {
        println("The name was changed")
        field = value.toUpperCase() // 대문자 변경
    }

    var age: Int = _age
}

fun main() {
    var user = CustomUser(1, "lowell", 21)
//    user.name = "leeyejin" // 외부에서 프로퍼티에 값을 할당하지 못함.

    println("user name is ${user.name}")
}
