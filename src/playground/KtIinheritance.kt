open class HumanInhe{
    open fun think(){
        println("Real Thinking")
    }
}

class AlienInhe: HumanInhe() {
    override fun think(){
        println("Virtual Thinking")
    }
}
fun main(args : Array<String>)
{
    var gilwell : HumanInhe = AlienInhe ()
    gilwell.think()
}

// Human h = new AlienInhe()