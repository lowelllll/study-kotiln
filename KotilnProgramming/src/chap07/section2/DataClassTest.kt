package chap07.section2

data class Customer(var name: String, var age: Int)

fun main() {
    val cus1 = Customer("yejin", 21)
    val cus2 = Customer("hs", 29)

    println(cus1 == cus2)
    println(cus1.equals(cus2))
    println(cus1.hashCode())

    val cus3 = cus1.copy(name="lowell")
    println(cus3.toString())
    println(cus1.toString())

    // destructuring
    val (name, age) = cus1

    println("$name, $age")

    val name2 = cus2.component1()
    val age2 = cus2.component2()

    val myLambda = {(n, a): Customer ->
        println(n)
        println(a)
    }

    println(myLambda(cus1).toString())
}