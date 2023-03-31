package oop.class_and_obj

class Human {
    private var name = "Anthony"
    private var age = 24

    fun printInfo(){
        println("Human name: $name")
        println("Human age: $age")
    }
}

fun main() {
    val obj = Human()
    obj.printInfo()
}