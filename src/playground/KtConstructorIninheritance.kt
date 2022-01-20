open class CnHumanInhe(age: Int){
    init {
        println("In Human --- Age $age")
    }
    open fun think(){
        println("Real Thinking")
    }
}

class CnAlienInhe(age: Int): CnHumanInhe(30) {
    init {
        println("In Alien ---------------- ")
    }
    override fun think(){
        println("Virtual Thinking")
    }
}
fun main(args : Array<String>)
{
    var gilwell : CnHumanInhe = CnAlienInhe (30)
//    gilwell.think()
}

// Human h = new AlienInhe()