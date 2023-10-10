package oop.class_and_obj

class IPhone {
    private var phoneNumber:String = "0938 828 193"

    fun call(){
        println("Calling to $phoneNumber")
    }

    fun getPhoneNumber(): String {
        return this.phoneNumber
    }

    fun setPhoneNumber(phoneNumber: String) {
        this.phoneNumber = phoneNumber
    }
}

fun main(){
    var myIPhone = IPhone();
    myIPhone.call()

    var yourIphone = IPhone()
    yourIphone.setPhoneNumber("076 871 2718")
    myIPhone.sendMessage(yourIphone)
}


// define new function outside a class
fun IPhone.sendMessage(ip:IPhone){
    println("Sending message from ${ip.getPhoneNumber()}")
}