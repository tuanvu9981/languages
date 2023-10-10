package oop.generic

import oop.inheritance_and_abstract.Phone

fun main(args: Array<String>){
    var obj1 = GenericExample<String>("JAVA")
    var obj2 = GenericExample<Int>(100)
    // Value JAVA
    // Value 100

    println(obj1) // oop.generic.GenericExample@87aac27
    println(obj2) // oop.generic.GenericExample@3e3abc88

    var phone1 = Device();
    var phone2 = Phone();
    var obj3 = GenericDevice<Device>(phone1);
    var obj4 = GenericDevice<Phone>(phone2);

}

class GenericExample<T>(input: T){
    init {
        println("Value $input");
    }
}

open class Device {
    val brand:String = ""

    open fun call(phoneNumber:String){
        println("Calling to $phoneNumber by phone ... ")
    }
}

class Phone():Device() {
    override fun call(phoneNumber: String) {
        // chỉ định rõ gọi method của cái gì bằng Super<ParentsClass>
        super<Device>.call(phoneNumber)
        println("Calling to $phoneNumber by a smartphone ...")
    }
}

class GenericDevice<out T>(input: T){
    init {
        println("Calling $input")
    }
}