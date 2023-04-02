package oop.inheritance_and_abstract

// implicitly extends Any class, having equals(), hashCode(), and toString() methods
class Example

// By default, Kotlin classes are final. Only "open" class can be inheritable

/****** 1. With primary constructors ******/
open class Animal(private val height:Double, private val weight:Double){
    fun printAnimalInfo(){
        println("Animal: $height (m), $weight (kg)\n")
    }
}

class Zebra(height: Double, weight: Double) : Animal(height,weight) {}

// Using secondary constructors
open class Plant{
    protected val age:Int
    protected val name:String
    open val whereToLive:String = "forest"

    constructor(age:Int, name:String){
        this.age = age
        this.name = name
    }

    // only open method is inheritable
    open fun printPlantInfo(){
        println("Age: $age, name: $name, living in: $whereToLive")
    }
}

/****** 2. With secondary constructors ******/
class Jasmine : Plant {
    private val flowerColor:String

    // override an "open" attribute, with keyword "override"
    override val whereToLive: String = "garden"

    constructor(age: Int, name: String, flowerColor:String) : super(age, name) {
        this.flowerColor = flowerColor
    }

    override fun printPlantInfo() {
        // super.printPlantInfo()
        println("Age: $age, name: $name, flower color: $flowerColor, lives in: $whereToLive")
    }
}

/****** 3. Child class has a method with same name as overridden one ******/
open class Phone {
    open fun call(phoneNumber:String){
        println("Calling to $phoneNumber by phone ... ")
    }
}

interface Callable {
    // interface methods are open by default
    fun call(phoneNumber: String){
        println("Calling to $phoneNumber by a callable devices ... ")
    }
}

class SmartPhone() : Phone(), Callable {
    override fun call(phoneNumber: String) {
        // chỉ định rõ gọi method của cái gì bằng Super<ParentsClass>
        super<Callable>.call(phoneNumber)
        super<Phone>.call(phoneNumber)
        println("Calling to $phoneNumber by a smartphone ...")
    }

}

fun main() {
    // 1. Primary constructor
    val marky = Zebra(1.4, 85.0)
    marky.printAnimalInfo()

    // 2. Secondary constructor
    val jasmine = Jasmine(3, "Jasmine", "white")
    jasmine.printPlantInfo()

    // 3. Handle with overriding rules
    val iphone = SmartPhone()
    iphone.call("012 345 6789")
}

