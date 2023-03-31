package oop.class_and_obj

class MankindNested {
    // MankindNested is an outer class
    class Asian{
        fun greet(){
            println("Im Asian")
        }
    }

    class African {
        fun greet(){
            println("Im African")
        }
    }

    class European{
        fun greet(){
            println("Im European")
        }
    }
}

fun main() {
    val hiroto = MankindNested.Asian()
    hiroto.greet()

    val peter = MankindNested.European()
}