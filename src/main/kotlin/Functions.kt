fun main() {

    val books = mutableListOf<Book>( Book(
        "8850333404",
        "Android 6: guida per lo sviluppatore (Italian Edition)",
        846,
        Price(39.26, "£"),
        2.1,
        2016,
        "Massimo Carli"
    ))
    // 1
    var bookFun = bookWeightFun
    println("Book weight: ${bookFun(books[0])} Kg")

    // 2
    bookFun = bookPriceFun
    println("Book price: ${bookFun(books[0])} £")
}