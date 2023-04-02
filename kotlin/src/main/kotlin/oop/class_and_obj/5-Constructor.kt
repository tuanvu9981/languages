package oop.class_and_obj

/*** 1. Primary constructors ***************/
/*************** 1a. constructor with private var as parameter ***************/
class PaymentHistory1 (private var currentMoney: Double, private val price: Double){
    // val: read-only value = const, not change
    // var: change later
    fun printPayment1(){
        println("Before payment: $currentMoney")
        println("After payment: $currentMoney - $price = ${currentMoney - price}\n")
    }
}

/*************** 1b. constructor with parameters removing private val, init ***************/
class PaymentHistory2(systemCurrentMoney: Double, private val price: Double){
    private var currentMoney:Double
    // attribute as parameter SHOULD REMOVE "PRIVATE VAL"

    // Can have multiple init function()
    init {
        this.currentMoney = systemCurrentMoney
        println("Before payment: $currentMoney")
    }

    init {
        this.currentMoney = systemCurrentMoney
        println("Your account before payment: $currentMoney")
    }

    fun printPayment2(){
        println("After payment: $currentMoney - $price = ${currentMoney - price}\n")
    }
}

/*************** 1c. Default values ***************/
class PaymentHistory3(systemCurrentMoney: Double, private val price: Double = 30.0){
    private var currentMoney:Double
    init {
        currentMoney = systemCurrentMoney
        println("Before payment: $currentMoney")
    }

    fun printPayment3(){
        println("After payment: $currentMoney - $price = ${currentMoney - price}\n")
    }
}

/*** 2. Second constructors ***************/
/*************** 2a. constructor ***************/
class Animal {
    private var weight:Double
    private var height:Double
    private var name:String

    init {
        println("Initializer Block")
        this.name = ""
    }

    constructor(ipHeight:Double, ipWeight:Double){
        this.weight = ipWeight
        this.height = ipHeight
    }

    constructor(height: Double, weight:Double, name:String){
        this.weight = weight
        this.height = height
        this.name = name
    }

    fun printInfo(newName:String){
        this.name = newName
        println("Animal information: $name, $height (m), $weight (kg)\n")
    }

    fun printInfo(){
        println("Animal information: $name, $height (m), $weight (kg)\n")
    }
}

fun main() {
    val payment1 = PaymentHistory1(500.5, 10.4)
    payment1.printPayment1()

    val payment2 = PaymentHistory2(400.5, 24.5)
    payment2.printPayment2()

    val payment3a = PaymentHistory3(500.0)
    payment3a.printPayment3()

    val payment3b = PaymentHistory3(500.0, 50.0)
    payment3b.printPayment3()

    // Madagascar
    val lion = Animal(1.5, 350.0)
    lion.printInfo("Alex")

    val zebra = Animal(1.5, 80.4, "Marky")
    zebra.printInfo()
}
