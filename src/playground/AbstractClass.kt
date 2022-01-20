package playground

abstract class HumanAbs() {
//    open fun think() {
//        println("Real Thinking")
//    }
    abstract fun think()
    fun talk(){
        println("HumanAbs Talk")
    }
}

class Doctor : HumanAbs() {
    override fun think() {
        println("Doctor Thinking, Critical Thinking")
    }
}

class AlienAbs : HumanAbs() {
    override fun think() {
        println("Virtual Thinking")
    }
}

fun main(args: Array<String>) {
    var gilwell: HumanAbs = AlienAbs()
    gilwell.talk()
    gilwell.think()
}