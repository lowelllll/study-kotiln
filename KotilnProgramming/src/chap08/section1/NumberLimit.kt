package chap08.section1

class Calc<T: Number> { // 형식 매개변수 제한 number형으로만 사용해야함
    fun plus(arg1: T, arg2: T): Double {
        return arg1.toDouble() + arg2.toDouble()
    }
}