package chap03.section3

fun main() {
    var result: Int
    val multi: (Int, Int) -> Int = {x: Int, y: Int -> x * y}
    result = multi(3, 4)
    println(result)

    val greet: () -> Unit = { println("Hello world! ")} // 선언, 자료형 생략 가능
    val square: (Int) -> Int = {x -> x * x} // 선언 생략 가능

    val nestedLambda = {{println("nested")}} // val nestedLambda: () -> () -> Unit = {{..}}

}