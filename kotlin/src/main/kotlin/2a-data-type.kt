fun main() {
    // 1. Basic Types
    val myNum: Int = 5                // Int
    val myDoubleNum: Double = 5.99    // Double
    val myLetter: Char = 'D'          // Char
    val myBoolean: Boolean = true     // Boolean
    val myText: String = "Hello"      // String
    val anything: Any = 123           // Parents of every "type class"

    // 2. Check type of variable by keyword "is"
    println(myNum is Int)       // true
    println(anything is Int)    // true

    // 3. Or with **<variable>::class.qualifiedName**
    println(myBoolean::class.qualifiedName)
    // Output: kotlin.Boolean

    // 4. Array
    var computerBrands = arrayOf("ASUS", "Macbook", "Dell")
    println(computerBrands[2])      // Dell

    // change value
    computerBrands[2] = "Lenovo"
    println(computerBrands[2])

    // length of array
    println(computerBrands.size)

    // element is in array or not
    println("Vinfast" in computerBrands)    // false
    println("ASUS" in computerBrands)       // true

    // traverse through an array
    for (x in computerBrands){
        println(x)
    }


}