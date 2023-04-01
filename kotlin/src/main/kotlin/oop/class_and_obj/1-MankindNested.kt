package oop.class_and_obj

class MankindNested {
    // MankindNested is an outer class.
    // Nested class inside the Outer class cannot access attributes and methods of Outer class

    private var numberOfPeople:Int = 0

    fun addPeople(){
        numberOfPeople += 1
    }

    class Asian{
        var numberOfAsian:Int = 0

        private fun addAsianPeople(){
            numberOfAsian += 1
        }

        fun greet(){
            // cannot access numberOfPeople, and function addPeople()
            println("Im Asian")
            addAsianPeople()
            println("Current asian people now: $numberOfAsian\n")
        }
    }

    class African {
        fun greet(){
            println("Im African")
            // cannot access numberOfPeople, and function addPeople()
        }
    }

    class European{
        val numberOfEuropeanPeople:Int = 1
        fun greet(){
            println("Im European")
            // cannot access numberOfPeople, and function addPeople()
        }
    }
}

fun main() {
    val hiroto = MankindNested.Asian()
    println(hiroto)
    // Current asian people now: 1

    val cheng = MankindNested.Asian()
    cheng.greet()
    // Current asian people now: 1

    val numberOfEuropeanPeople:Int = MankindNested.European().numberOfEuropeanPeople
    // access without initialization
    println("Number of European people now: $numberOfEuropeanPeople")
}