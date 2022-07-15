package com.example.algoritms.easy

/**
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
 */

fun main() {
    val s = "Hello dear this is   Dream   "
    println(lengthOfLastWord(s))
}

fun lengthOfLastWord(s: String): Int {
    val wordList = s.split(" ").toList()
    var lastIndex = wordList.lastIndex
    val size: Int
    while (true) {
        if (wordList[lastIndex] == "") {
            lastIndex--
        } else {
            size = wordList[lastIndex].length
            break
        }
    }
    return size
}