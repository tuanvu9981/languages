package oop.class_and_obj

class MankindInner {
    private var numberOfPeople:Int = 0
    inner class Asian {
        // Inner class can access private attributes of Outer class MankindInner
        fun addNewAsianPerson(){
            numberOfPeople += 1
            println("Added new Asian people")
            println("Current people: $numberOfPeople")
        }
    }

    inner class European {
        fun addNewEuropeanPerson(){
            numberOfPeople += 1
            println("Added new European people")
            println("Current people: $numberOfPeople")
        }
    }

    inner class African {
        fun addNewAfricanPerson(){
            numberOfPeople += 1
            println("Added new African people")
            println("Current people: $numberOfPeople")
        }
    }
}

fun main() {
    // INNER CLASS --> NOT STATIC --> Outer class must be initialized
    // Nested class --> STATIC --> val henry = MankindNested.Asian()
    val henry = MankindInner().European()
    henry.addNewEuropeanPerson()
    // Current people: 1

    val muhammed = MankindInner().African()
    muhammed.addNewAfricanPerson()
    // Current people: 1
}