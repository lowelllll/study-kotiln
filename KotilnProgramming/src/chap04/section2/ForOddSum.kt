package chap04.section2

fun main() {
    var total: Int = 0

    for(num in 1..100 step 2) total += num // for i in range(1, 101, 2)
    println("Odd total: $total")

    total=0
    for(num in 0..99 step 2) total += num
    println("Even total: $total")

    for(num in 10 downTo 0) print("$num ")
}