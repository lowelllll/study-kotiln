package chap03.section5

fun main() {
    val source = "Hello World!"
    val target = "Kotiln"

    println(source.getLongString(target))
}

fun String.getLongString(target: String): String = // String 클래스에 함수 추가
    if (this.length > target.length) this else target
