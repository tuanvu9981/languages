fun main() {
    // ************ 3. Set ************
    val immutableSet = setOf<Int>(1,2,3,4,5)
    println(immutableSet)

    val mutableSet = mutableSetOf<Int>(0,1,2,3)
    println(mutableSet)
    mutableSet.add(2)
    println(mutableSet)

    // contains
    println(mutableSet.contains(0))

    // isEmpty
    println(mutableSet.isEmpty())

    // traverse
    // a. Iterator
    val iterSet = mutableSet.iterator()
    while (iterSet.hasNext()){
        print("${iterSet.next()}  ")
    }

    // b. in
    for (x in mutableSet){
        print("$x  ")
    }

    //  ************ 4. Map ************
    println()
    val immutableMap = mapOf<String,Double>("PI" to 3.14, "e" to 2.718)
    // val pairImmutableMap = mapOf(Pair("PI", 3.14), Pair("e", 2.718))
    println(immutableMap)

    var mutableMap = mutableMapOf<String, String>("JP" to "Japan", "VN" to "Vietnam")
    println(mutableMap)
    mutableMap["CN"] = "China"
    println(mutableMap)

    // get value of key
    println(mutableMap.get("VN"))

    val filtered = mutableMap.filter { (key, value) -> key.contains("N") }
    println(filtered)

    // loops, traverse
    // a. iterator
    var iterMap = mutableMap.iterator()
    while (iterMap.hasNext()){
        println(iterMap.next())
    }
    println()

    // b. for
    for (x in mutableMap){
        println(x)
    }
    println()

    // c. forEach
    mutableMap.forEach { (k, v) -> println("$k - $v") }

    // size, length
    println(mutableMap.size)
    println(mutableMap.count())



}