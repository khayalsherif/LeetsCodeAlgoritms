package com.example.algoritms.easy

fun main() {
    println(isPalindrome(-121))
}

fun isPalindrome(x: Int): Boolean {
    val reverseInt = x.toString().reversed()
    return x.toString() == reverseInt
}