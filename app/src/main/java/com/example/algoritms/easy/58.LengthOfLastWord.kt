package com.example.algoritms.easy

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