package com.example.algoritms.easy

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

1.Open brackets must be closed by the same type of brackets.
2.Open brackets must be closed in the correct order.
 */
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