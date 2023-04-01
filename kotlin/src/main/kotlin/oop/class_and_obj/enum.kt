package oop.class_and_obj

import java.awt.Shape
import kotlin.math.sqrt

// 1. Basic Enum
enum class Direction {
    EAST, WEST, SOUTH, NORTH
}

// 2. Initiate Enum as constructor
enum class MathConstant(val const:Double){
    PI(3.1415),
    E(2.718),
    ZERO(0.0)
}

// 3. Initiate Enum by overriding abstract function
enum class ShapeArea {

    EQUILATERAL_TRIANGLE {
        // tam giác đều
        override fun calculate(edge: Double) = edge * sqrt(3.0) / 2.0
    },
    CIRCLE {
        override fun calculate(edge: Double) = 3.14 * edge * edge
    },
    SQUARE {
        override fun calculate(edge: Double) = edge * edge
    };

    abstract fun calculate(edge:Double): Double
    // function parameter, no "val" or "var"
}

fun main() {
    /*************** 1. Test 1st way: Basic Enum ***************/
    println(Direction.SOUTH::class.qualifiedName)
    // oop.class_and_obj.Direction

    println(Direction.SOUTH.ordinal)
    // 2 (3rd, start from 0th) --> order --> ordinal

    println(Direction.WEST)
    // WEST
    println()

    /*************** 2. Test 2nd way: Initiate Enum as constructor ***************/
    val radius:Double = 3.0
    println(MathConstant.PI::class.qualifiedName)
    // oop.class_and_obj.MathConstant

    println(MathConstant.PI.const)
    // 3.1415

    println(MathConstant.PI)
    // PI
    println()

    /*************** 3. Test 3rd way: Initiate Enum by overriding abstract function ***************/
    println(ShapeArea.SQUARE.calculate(radius))
    // 9.0
    println(ShapeArea.SQUARE::class.qualifiedName)
    // oop.class_and_obj.ShapeArea.SQUARE
}