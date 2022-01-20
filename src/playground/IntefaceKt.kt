interface A {
    fun show()
    fun abc() {
        println("In ABC in interface A")
    }
}

interface B {
    fun display()
    fun abc() {
        println("In ABC in interface B")
    }
}

class C : A, B {
    override fun show() {
        println("Interface A In Show")
    }

    override fun display() {
        println("Interface B  In Display")
    }

    override fun abc() {
        super<A>.abc()
       println("In ABC C")
    }
}

fun main(args: Array<String>) {
    var obj = C()


    obj.show()
    obj.display()
    obj.abc()
}