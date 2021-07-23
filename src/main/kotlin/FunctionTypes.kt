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
    var mapper: BookMapper<Double> = ::bookWeight
    // 2
    var currency: BookMapper<String> = { book -> book.price.currency }
    // 3
    println("Weight of ${books[0].name} is ${mapper(books[0])} Kg")
    // 4
    mapper = ::bookPrice
    // 5
    println("Price of ${books[0].name} is ${mapper(books[0])}${currency(books[0])}")
}