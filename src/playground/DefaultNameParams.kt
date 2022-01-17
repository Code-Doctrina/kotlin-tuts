fun main(args: Array<String>) {
//    var finalAmt = calAmount(50) // Using Default interest Parameters
    var finalAmt = calAmount(amt = 50, interest = 0.03)
    println("finalAmt ---------------------- finalAmt $finalAmt")
}

@JvmOverloads // Creates amount and interest as a parameter if you are Kotlin in Java Class
fun calAmount(amt: Int, interest: Double = 0.04): Int { // Asign Interest as a Default Value of 0.04
    return (amt + amt * interest).toInt() // Type Cast to Integer
}