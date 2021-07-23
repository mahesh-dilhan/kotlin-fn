
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

fun bookWeight(book: Book) = book.weight

fun bookPrice(book: Book) = book.price.value

val bookWeightFun = fun(book: Book) = book.weight
val bookPriceFun = fun(book: Book) = book.price.value