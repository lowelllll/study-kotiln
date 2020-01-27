package chap07.section2

sealed class Result {
    open class Success(val message: String): Result()
    class Error(val code: Int, val message: String): Result()
}


class Status: Result()
class Inside: Result.Success("status") // 내부 클래스 상속

fun main() {
    val result = Result.Success("OK")
    val msg = eval(result)

    println(msg)
}

fun eval(result: Result): String = when(result) {
    // else가 필요 없음
    is Status -> "in Progress"
    is Result.Success -> result.message
    is Result.Error -> result.message
}