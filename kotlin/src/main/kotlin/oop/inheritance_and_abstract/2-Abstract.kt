package oop.inheritance_and_abstract

abstract class Computer {
    // abstract attributes
    abstract var maker:String
    protected var macAddress:String
    protected var madeIn:String
    protected var price:Int

    constructor(macAddress:String, madeIn:String, price:Int){
        this.macAddress = macAddress
        this.madeIn = madeIn
        this.price = price
    }

    fun isMadeInUSA():Boolean {
        return madeIn == "USA"
    }

    // abstract function
    abstract fun printInfo()
}

class Laptop : Computer {
    override var maker:String
    override fun printInfo() {
        println("Country: $madeIn")
        println("MAC Address: $macAddress")
        println("Maker: $maker")
        println("Price: $price")
    }

    constructor(macAddress:String, madeIn:String, price:Int, maker:String) : super(macAddress, madeIn, price){
        this.maker = maker
    }
}

fun main() {
    val macbookAir13 = Laptop("123", "USA", 4799, "Apple")
    println(macbookAir13.isMadeInUSA())
    macbookAir13.printInfo()
}