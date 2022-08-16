package com.example.algoritms.easy

fun main() {
    println(romanToInt("LVIII"))
    println(romanToInt2("DCXXI"))
}

fun romanToInt(s: String): Int {
    val hashMap = HashMap<String, Int>()
    var result = 0
    var index = 0
    hashMap.apply {
        put("I", 1)
        put("V", 5)
        put("X", 10)
        put("L", 50)
        put("C", 100)
        put("D", 500)
        put("M", 1000)
    }

    for (char in s) {
        if (s.lastIndex > index) {
            if (hashMap[char.toString()]!! >= hashMap[s[index + 1].toString()]!!) {
                result += hashMap[char.toString()]!!
            } else {
                result -= hashMap[char.toString()]!!
            }
        } else if (s.lastIndex == index) {
            if (hashMap[char.toString()]!! <= hashMap[s[index - 1].toString()]!!) {
                result += hashMap[char.toString()]!!
            } else {
                result -= hashMap[char.toString()]!!
            }
        }
        index++
    }
    return result
}


fun romanToInt2(s: String): Int {
    val hashMap = HashMap<String, Int>()
    var result = 0
    hashMap.apply {
        put("I", 1)
        put("V", 5)
        put("X", 10)
        put("L", 50)
        put("C", 100)
        put("D", 500)
        put("M", 1000)
    }
    s.onEachIndexed { index, char ->
        if (s.lastIndex > index) {
            if (hashMap[char.toString()]!! >= hashMap[s[index + 1].toString()]!!) {
                result += hashMap[char.toString()]!!
            } else {
                result -= hashMap[char.toString()]!!
            }
        } else if (s.lastIndex == index) {
            if (hashMap[char.toString()]!! >= hashMap[s[index - 1].toString()]!!) {
                result += hashMap[char.toString()]!!
            } else {
                result -= hashMap[char.toString()]!!
            }
        }
    }

    return result
}
