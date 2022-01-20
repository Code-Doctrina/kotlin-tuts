package playground
// Primary constructor
class Human (var n: String = "Papa"){
    var name: String = n
    fun think() {
        print("Kotlin is Awesome ....  $name")
    }
}


fun main(args :Array<String>) {
    var gilwell = Human()
    gilwell.think()
}