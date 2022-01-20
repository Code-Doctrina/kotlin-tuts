import java.lang.Exception
import java.lang.NumberFormatException

fun main(args: Array<String>){
    var str: String = "4a"
    var num: Int =  try {
       str.toInt()
    } catch (e: NumberFormatException) {
       -1
    }

    num++
    println("NUM ---------------------------- $num")
}