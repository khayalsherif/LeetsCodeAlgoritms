package com.example.algoritms.medium

import java.lang.StringBuilder

fun main() {
    val words = arrayOf("abc", "deq", "mee", "aqq", "dkd", "ccc")
    val pattern = "ccafcacccbb"

    println(findAndReplacePattern(words, pattern))
}

fun findAndReplacePattern(words: Array<String>, pattern: String): List<String> {
    val typeloghyBuilder = StringBuilder()
    var charChecker: Char = pattern[0]
    var charCounter = 0
    pattern.forEach { i ->
        if (charChecker == i) {
            charChecker = i
            charCounter++
        } else {
            typeloghyBuilder.append(charCounter)
            charCounter = 0
        }
    }
    println(typeloghyBuilder.toString())
    words.forEach { string ->

    }
    return emptyList()
}