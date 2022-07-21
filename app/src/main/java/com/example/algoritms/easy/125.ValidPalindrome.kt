package com.example.algoritms.easy

import java.util.regex.Matcher
import java.util.regex.Pattern

fun main() {
    println(isPalindrome("A man, a plan, a canal: Panama"))
}

fun isPalindrome(s: String): Boolean {
    val string = s.lowercase().replace("\\s".toRegex(), "")
    val stringBuilder = StringBuilder()
    string.forEach { char ->
        val p: Pattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE)
        val m: Matcher = p.matcher(char.toString())
        if (!m.find()) {
            stringBuilder.append(char)
        }
    }
    return stringBuilder.toString() == stringBuilder.toString().reversed()
}