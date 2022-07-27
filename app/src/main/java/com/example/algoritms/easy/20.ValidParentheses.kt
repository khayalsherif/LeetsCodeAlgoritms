package com.example.algoritms.easy


fun main() {
    println(isValid("{[]}()"))
}

fun isValid(string: String): Boolean {
    var count = 0
    for (i in string) {
        count++
        if (i == '(' && string[count] != ')') {
            break
        }
        if (i == '[' && string[count] != ']') {
            break
        }
        if (i == '{' && string[count] != '}') {
            break
        }
    }
    return count == string.length
}