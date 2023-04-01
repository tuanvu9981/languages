package oop.class_and_obj

interface Bird {
    fun fly();
}
fun main() {
    // Lớp vô danh (chỉ override method, không có thật)
    val parrot:Bird = object:Bird{
        override fun fly() {
            println("Parrot is flying !!")
        }
    }
    parrot.fly()
    // Parrot is flying !!

    val sakura:Flower = Flower("pink", "Japan", 5.0)
    println(sakura)
    // (pink, Japan, 5.0)
}

typealias Flower = Triple<String, String, Double>