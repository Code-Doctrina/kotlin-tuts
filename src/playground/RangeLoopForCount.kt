    fun main(args: Array<String>){
//        var str: String? = null
//        var gilwell: Alien ?  = Alien()
//        gilwell = null
//        println("Gilwell ------- gilwell $gilwell.name")

//        // Switch in Kotlin
//        val num : Int = 2
//        var str = when(num) {
//            1 -> "One"
//            2 -> "Two"
//            3 -> "Three"
//            else -> "Give a Proper Input"
//        }
//        println("str ------- str ======================== $str")

        // Range of Values
        var nums = 1..100
        var nums_down_to = 1 until 100
//        for(a in nums step 2){ // Prime Factors
//            println("Range of Values ======================== $a")
//        }
        for(a in nums_down_to.reversed()){ // Prime Factors
            println("Range of Values ======================== $a")
        }

        var strRange = 'A' .. 'z'
        for(a in strRange){
            println("Range of strRange ======================== Count is $a")
        }

        println("Range of Values ======================== Count is $nums_down_to.count()")

    }