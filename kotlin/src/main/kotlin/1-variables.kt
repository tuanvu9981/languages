
fun printInfo(countryName:String, gDP:Double, population:Int){
    println("Country: $countryName")
    println("GDP: $gDP billion dollars")
    println("Population: $population million people\n")
}
fun main() {
    // 1st declaration (var -> mutable value)
    var countryName = "VietNam"
    var GDP = 409.5
    var population = 100
    printInfo(countryName, GDP, population)

    // re-assign value (mutable)
    countryName = "Korea"
    GDP = 1450.7
    population = 53
    printInfo(countryName, GDP, population)

    // 2nd declaration (var -> mutable value)
    var countryName2:String = "Japan"
    var GDP2:Double = 5001.4
    var population2:Int = 125
    printInfo(countryName2, GDP2, population2)

    countryName2 = "Germany"
    GDP2 = 3650.7
    population2 = 83
    printInfo(countryName2, GDP2, population2)

    /* 
    // *** Error 
    var countryName3
    countryName3 = "China"
    --> Unknown type --> cant assign values

    // *** How to fix
    var countryName3:String
    countryName3 = "China"
    --> Already known type --> easy to assign
    */
    
    // constant = val (value)
    val PI = 3.14
    var radius = 10
    println("Area of circle: ${PI*radius*radius}")
    radius = 12
    println("Area of circle: ${PI*radius*radius}")
}