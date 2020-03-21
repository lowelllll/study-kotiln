package chap10.section1

fun main() {
    data class User(val name: String, var skills: String, var email: String? = null)
    val user = User("lowell", "kotlin")

    val result = with(user) { // with은 safe call을 할 수 없음.
        skills = "python"
        email = "lowell@lowell.com"
    }

    println(user)
    println("result: $result")
}