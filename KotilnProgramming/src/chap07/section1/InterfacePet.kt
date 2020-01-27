package chap07.section1

interface Pet {
    var category: String // default로 추상 프로퍼티 -> 프로퍼티에 값을 지정할 수 없음.
    fun feeding() // default 추상 메서드
    fun patting() {
        println("Keep patting!")
    }

    var species: String // 종

//    val name: String
//    get() = "lowell" // val 변수는 게터를 통해 반환값 설정
}

class Cat(name: String, override var category: String, override var species: String = "cat"): Animal(name), Pet {
    override fun feeding() {
       println("Feed the cat a tuna can!")
    }
}

fun main() {
    val obj = Cat("lolo","small")
    println("Pet Category: ${obj.category}")

    obj.feeding()
    obj.patting()
}