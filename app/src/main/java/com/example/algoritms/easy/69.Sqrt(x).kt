package com.example.algoritms.easy

fun main() {
    mySqrt(8)
}

fun mySqrt(x: Int): Int {
    val double = Math.sqrt(x.toDouble())
    return double.toInt()
}