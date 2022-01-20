package playground.playground

import playground.Alien_Extensions

fun main(args: Array<String>) {
    var a1 = Alien_Extensions()
    a1.skills = "Kotlin"
    a1.show()

    var a2 = Alien_Extensions()
    a2.skills = "SQL"
    a2.show()

    var a3 = a1.plus(a2)
    a3.show()
}

fun Alien_Extensions.plus(a: Alien_Extensions): Alien_Extensions {
    var newAlien = Alien_Extensions()
    newAlien.skills = this.skills + " " + a.skills
    return newAlien
}