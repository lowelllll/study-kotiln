package chap08.section1

class GenericNull<T> {
    fun EqualityFunc(arg1: T, arg2: T) { // T는 기본적으로 null을 허용함.
        println(arg1?.equals(arg2))
    }
}

// null 허용하지 않는 법
//class GenericNull<T: Any> {
//
//}

fun main() {
    val obj = GenericNull<String>()
    obj.EqualityFunc("Hello", "World")

    val obj2 = GenericNull<Int?>()
    obj2.EqualityFunc(null, 1)
}