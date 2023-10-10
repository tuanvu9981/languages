package oop.generic

fun main(args: Array<String>){
    try {
        val myVar:Int = 12;
        val v:String = "Tutorial Kotlin";
        v.toInt();
    } catch (e:Exception){
        e.printStackTrace();
    } finally {
        println("Exception handled by Kotlin")
    }
}

// "Tutorial Kotlin" is a string cannot be converted to Integer.
// "123" wont cause exception, but "Tutorial Kotlin" will.