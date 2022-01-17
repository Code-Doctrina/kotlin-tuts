import java.util.*

fun main(args: Array<String>){
    var nums  = listOf(1,2,3,4,5,6,7,8,9,10)
//    for (i in nums) {
//        print(i)
//    }
    // Get the Index Value
//    for((i, e) in nums.withIndex()){
//        println("$i ---------------: $e")
//    }
    // Using The Map
    var aliens = TreeMap<String, Int>() // Import the TreeMap, it is a Java Package
    aliens["Gilwell"] = 32
    aliens["Grey"] = 22
    for((name, age) in aliens){ // Get the alien name and age
        println("Aliens ---- $name ---------------: $age")
    }

}