// 1. Every Class needs a ToString
// 2. When comparing Objects in Java Equals and HashCode
// 3. Copy

data class BookObjKw(val name: String, val price: Int)
object BookShelf {
    var books = arrayListOf<BookObjKw>()
    fun showBooks() {
        for (i in books){
            println("Printing show Books $i")
        }
    }

}

fun main(args: Array<String>) {
    BookShelf.books.add(BookObjKw("Java", 50))
    BookShelf.books.add(BookObjKw("SQL", 40))
    BookShelf.books.add(BookObjKw("Kotlin", 80))
    BookShelf.showBooks()
}