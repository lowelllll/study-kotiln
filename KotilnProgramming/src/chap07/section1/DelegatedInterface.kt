package chap07.section1

interface Nameable {
    var name: String
}

class StaffName: Nameable {
    override var name: String = "lowell"
}

class Work: Runnable {
    override fun run() {
       println("work...")
    }
}

class Person(name: Nameable, work: Runnable): Nameable by name, Runnable by work

fun main() {
    val person = Person(StaffName(), Work()) // 객체 전달

    println(person.name) // 각 클래스에 위임된 멤버에게 접근할 수 있음.
    person.run()
}