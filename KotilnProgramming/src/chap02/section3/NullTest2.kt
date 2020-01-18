package chap02.section3

fun main() {
    var str1: String? = "Hello Kotiln"
    str1 = null
    println("str1: $str1 length: ${str1?.length}")

    val len = if(str1 != null) str1.length else -1
    println("str1: $str1 length: $len")

    str1= "Hi!"
    println("str1: $str1 length: ${str1?.length ?: -1}") // 엘비스 연산자 if(str1 != null) str1.length else -1 와 동일
}