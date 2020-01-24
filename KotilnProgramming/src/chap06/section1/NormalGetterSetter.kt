package chap06.section1

class User1(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field // 프로퍼티를 참조하는 함수
    // get() = id -> get() = get() 재귀호출

    var name: String = _name
        get() = field
        set(value) { // 세터의 매개변수
            field = value // this.name = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    var user1 = User1(1, "lowell", 21)
    user1.age = 20

    println("user1 age is ${user1.age}")
}