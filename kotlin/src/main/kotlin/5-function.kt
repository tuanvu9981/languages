fun multiple(a: Int, b:Int): Int {
    return a * b
}

// 1. function as a parameter
fun calculate(a: Int, b: Int, operation:(Int, Int) -> Int): Int{
    return operation(a,b)
}

fun square(x: Int) = x * x

// 2. a function return another function
fun calculateSquareOfInteger(): (Int) -> Int {
    return ::square
}

// 3. Lambda function
// + Start with { }, (param) -> (result)
val lowerCaseStr = {str: String -> str.lowercase()}

// 4. inline function: Copy a function & replace
inline fun printSomething(inputNum: Int, function: (x: Int) -> Int){
    println("******** RESULT WHEN CALCULATING SQUARE ********")
    val result = function(inputNum)
    println("Calculation Result: $result")
}
fun main() {
    val result = calculate(4,5, ::multiple)     // :: (a function as a parameter)
    println("result_1 = $result")

    val resultFunc = calculateSquareOfInteger()
    println("result_2 = ${resultFunc(12)}")

    val rootStr = "Ho Chi Minh City"
    println(lowerCaseStr::class.qualifiedName)  // null
    println(lowerCaseStr(rootStr))  // ho chi minh city

    printSomething(13, ::square)

}