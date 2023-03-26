fun main() {
    // 1. String functions
    val cityName = "Ho Chi Minh City"
    println(cityName[0])    // H

    // length of string
    println(cityName.length)    // 16

    // turn the whole string to uppercase or lowercase
    println(cityName.uppercase())
    println(cityName.lowercase())

    val cityName2 = "Ho Chi Minh City"
    val cityName3 = "Ha Noi"
    println("city1 == city2 : ${cityName.compareTo(cityName2)}")
    // 0 (Equal)
    println("city1 == city3 : ${cityName.compareTo(cityName3)}")
    // 14 != 0 (Not equal)

    // 2. List
    // a. Read-Only List
    val readOnlyList = listOf<Any>("String", 3.14, 10)
    println(readOnlyList[1])
    // b. Mutable list
    var mutableList = mutableListOf<String>("Today", "Tomorrow", "Yesterday")
    mutableList.add("Sunday")
    println(mutableList)
    mutableList.remove("Today")
    println(mutableList)

    // "contains" & "in"
    val isYesterdayExist = "Yesterday" in mutableList
    println(isYesterdayExist)
    println(mutableList.contains("Yesterday"))

    // isEmpty() methods
    println(mutableList.isEmpty()) // false

    // traverse a List
    // 1. Iterator
    var iter = mutableList.listIterator()
    while (iter.hasNext()){
        println(iter.next())
    }

    // 2. For loop
    for (x in mutableList){
        println(x)
    }

}