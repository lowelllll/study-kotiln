package chap05.section6

class Pond(_name: String, _members: MutableList<Duck>) {
    val name: String = _name
    val members: MutableList<Duck> = _members
    constructor(_name: String) : this(_name, mutableListOf<Duck>())
}

class Duck(val name: String)

fun main() {
    // 집합관계
    // 특정 객체를 소유한다. 
    // 두 개체는 생명주기에 서로 영향을 주지 않음.
    val pond = Pond("MyPond") // 오리가 없음
    val duck1 = Duck("duck1")
    val duck2 = Duck("duck2")

    pond.members.add(duck1)
    pond.members.add(duck2)

    for (duck in pond.members) {
        println(duck.name)
    }

}