package playground// 1. Every Class needs a ToString
// 2. When comparing Objects in Java Equals and HashCode
// 3. Copy

data class Laptop(val brand: String, val price:Int){
    fun show(){
        println("Awesome Machine")
    }

}

fun main(args: Array<String>){
    val lap1 = Laptop("Dell", 2000)
    var lap2 = Laptop("Dell", 2000)

    var lap3 = lap1.copy(price=2200)

    println(lap1.equals(lap2))
    println("This is lap3 $lap3")
}