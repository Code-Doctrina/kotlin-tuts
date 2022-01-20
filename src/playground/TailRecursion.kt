import java.math.BigInteger

fun main(args: Array<String>) {
    var num = BigInteger("7")

//    var fact  = 1
//    for (i in 1..num){
//        fact = fact * i
//    }

    println("The Factorial of $num is factnum")
    println(fact(num, BigInteger.ONE))
}

tailrec fun fact(num:BigInteger, result:BigInteger) : BigInteger{
   if(num == BigInteger.ZERO)
       return result
   else
       println("The BigInteger of $num")
       return  fact(num - BigInteger.ONE, num*result) // 5 * 4! -> 4 * 3!
}