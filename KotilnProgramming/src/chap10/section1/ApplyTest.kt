package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)

    var person = Person("lowell", "kotlin")
    person.apply { this.skills = "python" }

    println(person)

    val returnObj = person.apply { // this 생략 가능
        name = "yejin"
        skills = "java"
    }

    println(person)
    println(returnObj)
}