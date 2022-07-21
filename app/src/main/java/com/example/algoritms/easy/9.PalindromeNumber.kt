package com.example.algoritms.easy
/*
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.
For example, 121 is a palindrome while 123 is not.
*/
fun main() {
    println(isPalindrome(-121))
}

fun isPalindrome(x: Int): Boolean {
    val reverseInt = x.toString().reversed()
    return x.toString() == reverseInt
}