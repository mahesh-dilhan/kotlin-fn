
data class Price(val value: Double, val currency: String = "$")

data class Book(
    val ISDN: String,
    val name: String,
    val pages: Int,
    val price: Price,
    val weight: Double,
    val year: Int,
    val author: String
)
fun main() {
    // 1
    var bookFun = bookWeightFun
    println("Book weight: ${bookFun(books[0])} Kg")

    // 2
    bookFun = bookPriceFun
    println("Book price: ${bookFun(books[0])} £")
}
fun bookWeight(book: Book) = book.weight

fun bookPrice(book: Book) = book.price.value

val bookWeightFun = fun(book: Book) = book.weight
val bookPriceFun = fun(book: Book) = book.price.value