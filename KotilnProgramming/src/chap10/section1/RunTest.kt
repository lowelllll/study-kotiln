package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)

    var person = Person("lowell", "kotlin")

    val returnObj = person.apply {
        name = "yejin"
        skills = "python"
        "success"
    }

    println(person)
    println("returnObj: $returnObj")

    val returnObj2 = person.run {
        name = "emily"
        skills = "data"
        "success"
    }

    println(person)
    println("returnObj2: $returnObj2")
}