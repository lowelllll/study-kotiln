package chap08.section1

fun <T> find(a: Array<T>, Target: T): Int {
    for (i in a.indices) {
        if (a[i] == Target) return i
    }

    return -1
}

fun main() {
    val arr1: Array<String> = arrayOf("Apple", "Banana", "Grape", "Cherry")
    val arr2: Array<Int> = arrayOf(1,2,3,4,5,6)

    println("arr1.indices ${arr1.indices}") // 유효범위 반환

    println(find(arr1, "Banana"))
    println(find(arr1, "Watermellon"))
    println(find(arr2, 3))
}