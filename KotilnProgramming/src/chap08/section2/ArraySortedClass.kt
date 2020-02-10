package chap08.section2

data class Product(
    val name: String,
    val price: Double
)

fun main() {
    val products = arrayOf(
        Product("macbook", 1000000.00),
        Product("Mouse", 5400.00),
        Product("cream", 12400.99),
        Product("tv", 870000.00),
        Product("calender", 7860.78)
    )

    products.sortBy { it.price } // price 순 정렬
    products.forEach { println(it) }
}