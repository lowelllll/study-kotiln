package chap08.section1

interface InterfaceA
interface InterfaceB

class HandlerA: InterfaceA, InterfaceB
class HandlerB: InterfaceA

class ClassA<T> where T: InterfaceA, T:InterfaceB // 2개의 인터페이스를 꼭 구현하는 클래스

fun main() {
    val obj1: ClassA<HandlerA> // OK
//    val obj2: ClassA<HandlerB> // ERROR
}

fun <T> myMax(a: T, b: T): T where T: Number, T:Comparable<T> { // T는 number거나 Comparable이여야만 함 
    return if (a> b) a else b
}