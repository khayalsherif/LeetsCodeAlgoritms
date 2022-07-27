package com.example.algoritms.easy

fun main() {
    val haystack = "aaaaa"
    val needle = "bba"
    println(strStr(haystack, needle))
}

fun strStr(haystack: String, needle: String): Int {
    return haystack.indexOf(needle)
}