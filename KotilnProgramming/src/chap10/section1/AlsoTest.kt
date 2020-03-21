package chap10.section1

fun main() {
    data class Person(val name: String, var skills: String)
    var person = Person("lowell", "kotlin")
    val a = person.let {
        it.skills = "python"
        "success"
    }
    println(person)

    println("a: $a")

    val b = person.also {
        it.skills = "java"
        "success"
    }

    println(person)
    println("b: $b") // person

}
