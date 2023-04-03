package oop.inheritance_and_abstract

interface ElectricRunnable {
    // default abstract attributes
    var voltage:Int

    // default abstract method
    fun isStandardVoltage():Boolean

    // default abstract method with default return value
    fun getElectricInfo() = ""
}

interface Flyable {
    fun isAbleToLiftOff():Boolean
}

class Telephone : ElectricRunnable {
    override var voltage: Int

    constructor(voltage:Int){
        this.voltage = voltage
    }

    override fun isStandardVoltage(): Boolean {
        return this.voltage == 220
    }

    override fun getElectricInfo(): String {
        return "Voltage: $voltage (V)"
    }
}

class AirPlane : ElectricRunnable, Flyable {
    override var voltage: Int
    private var gasolineAmount:Double

    constructor(voltage:Int, amount:Double){
        this.voltage = voltage
        this.gasolineAmount = amount
    }

    override fun isStandardVoltage(): Boolean {
        return this.voltage == 220
    }

    override fun getElectricInfo(): String {
        return "Voltage: $voltage (V)"
    }

    override fun isAbleToLiftOff(): Boolean {
        return gasolineAmount >= 2000.0
    }
}

fun main() {
    // class Telephone implements ElectricRunnable
    val myTelephone = Telephone(210)
    println(myTelephone.isStandardVoltage())

    // class AirPlane implements 2 interface Flyable and ElectricRunnable
    val plane = AirPlane(220, 3100.0)
    println("Is Standard Voltage: ${plane.isStandardVoltage()}")
    println("Is Able To Lift Off: ${plane.isAbleToLiftOff()}")

}

