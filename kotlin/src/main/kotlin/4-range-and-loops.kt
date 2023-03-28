
fun main() {
    val range1 = 1..5
    println(range1::class.qualifiedName) // type: kotlin.ranges.IntRange

    val range2 = 'a' .. 'z'
    println(range2::class.qualifiedName) // type: kotlin.ranges.CharRange

    // filter a range
    val f = range2.filter { T -> T == 'h' } // return a List
    println(f)

    // create range with rangeTo
    for (num in 1.rangeTo(4)){
        print("$num  ")
    }
    println()

    // backward ranges
    for (number in 4 downTo 1){
        print("$number  ")
    }
    println()

    // loop with step != 1
    for (num in 1..8 step 2){
        print("$num  ")
    }
    println()

    // Util functions of IntRange
    val abc = 1..15 step 2
    println(abc.first)
    println(abc.last)
    println(abc.min())
    println(abc.max())
    println(abc.average())
    println(abc.sum())
    println(abc.count())
}

