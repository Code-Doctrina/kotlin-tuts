package playground

import java.math.BigInteger

fun main(args: Array<String>) {
    var num = BigInteger("70000")

//    var fact  = 1
//    for (i in 1..num){
//        fact = fact * i
//    }

    println("The Factorial of $num is factnum")
    println(fact(num))
}

fun fact(num:BigInteger) : BigInteger{
   if(num == BigInteger.ZERO)
       return BigInteger.ONE
   else
       println("The BigInteger of $num")
       return num * fact(num - BigInteger.ONE) // 5 * 4! -> 4 * 3!
}