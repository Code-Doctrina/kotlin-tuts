@file: JvmName("FunMap") // TConvers FunctionsKT into a Class Name FunMap.class

fun main(args: Array<String>) {
    var addition = add(8, 5)
    println("This is addition =============== addition $addition")
    var maxValue = max(8, 65)
    println("This is maxValue =============== maxValue $maxValue")
}

// Long Functions
//fun add(a: Int, b: Int) : Int { // Int is used for the return type
//    return a+b
//}
//// Addition Inline Functions
fun add(a: Int, b: Int): Int = a + b

//fun max(a: Int, b: Int) : Int {
//    if(a > b)
//        return a
//    else
//        return b
//}

// Max Inline Function
fun max(a: Int, b: Int): Int = if (a > b) a else b