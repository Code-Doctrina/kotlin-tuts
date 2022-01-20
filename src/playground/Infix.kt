package playground

fun main(args: Array<String>) {
    var a1 = AlienInfix()
    a1.skills = "Kotlin"
    a1.show()

    var a2 = AlienInfix()
    a2.skills = "SQL"
    a2.show()

//    var a3 = a1 playground.plus (a2)
//    a3.show()
    // Operator OverLoading
    var a3 = a1 + (a2)
    a3.show()
}

//infix  fun AlienInfix.playground.plus(a: AlienInfix): AlienInfix {
// Operator Overloading
operator infix  fun AlienInfix.plus(a: AlienInfix): AlienInfix {
    var newAlien = AlienInfix()
    newAlien.skills = this.skills + " " + a.skills
    return newAlien
}