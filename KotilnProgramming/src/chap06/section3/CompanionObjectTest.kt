package chap06.section3


class Person {
    var id: Int = 0
    var name: String = "Yejin"

    companion object { // static
        // 컴패니억 객체는 실제 객체의 싱글톤으로 정의됨.
        var language: String = "Korean"
        fun work() {
            println("working...")
        }
    }
}


fun main() {
    println(Person.language) // 인스턴스 생성 안함

    Person.language = "English"
    println(Person.language)

    Person.work()
}