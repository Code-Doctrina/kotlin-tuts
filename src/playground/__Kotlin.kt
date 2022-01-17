@file:JvmName("_Kotlin_Kt")

fun main(args: Array<String>)
{
    var num1 : Int = 4
    var num2: Int = 7
    var result : Int = 0

    var str1 : String = "Gilwell"
    var str2 : String = "gilwell"

    if(str1 == str2)
        println("The String $str1 ============== $str2")
    else
        println("The String $str1 !================== $str2")

    if(str1.equals(str2, true))
        println("The String $str1 Equals $str2")
    else
        println("The String $str1 Does Not Equal $str2")

    result = if(num1 > num2)
         num1
    else if(num1 < num2)
         num2
    else
        num1


    println("This is the  RESULT =======================$result")



//    print(result)
//    println("\nThe addition of $num1 and $num2 is $result")
//
//    var gilwell = Alien()
//    gilwell.name ="Muhati"
//    println("Alien name is :: ${gilwell.name}")

}