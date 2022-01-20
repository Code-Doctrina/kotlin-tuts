package playground
// Secondary constructor
class SecHuman (var n: String = "Papa"){
    var name: String = n
    var age: Int = 0

    constructor(age: Int, name: String): this(name) { // Whenever you call a constructor with a value, call the primary constructor
            this.age = age
    }

//    init {
//        name = n
//        println("Human is Here ......!!! $name")
//    }
    fun think() {
        print("Kotlin is Awesome ....  $name :::: $age")
    }
}


fun main(args :Array<String>) {
    var gilwell = SecHuman(20, "Gilwell")
    gilwell.think()
}