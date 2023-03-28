fun main() {

    // break outer loop (normal break only out of inner loop)
    outerLoop@ for (i in 1..5){
        innerLoop@ for (j in 1..5){
            println("i = $i, j = $j")
            if (i == 2) break@outerLoop
        }
    }

    // continue: same
    outerLoop@ for(i in 3..6){
        innerLoop@ for (j in 3..6){
            println("i = $i, j = $j")
            if (i == 4) continue@outerLoop
        }
    }
}