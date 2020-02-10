package chap08.section2

fun main() {
    val products = arrayOf(
        Product("pen", 800.00),
        Product("cup", 3400.00),
        Product("bag", 23500.99),
        Product("apeach", 27500.50),
        Product("book", 12000.99)
    )

    products.sortWith( // comparator: 인터페이스
        Comparator<Product> {p1, p2 ->
            when {
                p1.price > p2.price -> 1
                p1.price == p2.price -> 0
                else ->  -1
            }
        }
    )

    products.sortWith(compareBy({it.name}, {it.price})) // 이름 먼저 정렬 후 가격 정렬
    products.forEach { println(it) }
}

