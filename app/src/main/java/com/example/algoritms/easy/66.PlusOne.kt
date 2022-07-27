package com.example.algoritms.easy

fun main() {
    val intArray = IntArray(10)
    intArray[0] = 9
    intArray[1] = 8
    intArray[2] = 7
    intArray[3] = 6
    intArray[4] = 5
    intArray[5] = 4
    intArray[6] = 3
    intArray[7] = 2
    intArray[8] = 1
    intArray[9] = 0

    println(plusOne(intArray).toList())
}

fun plusOne(digits: IntArray): IntArray {
    val stringBuilder = StringBuilder()
    for (i in digits) {
        stringBuilder.append(i)
    }
    val integer =
        stringBuilder.toString().toBigInteger() + 1.toString().toBigInteger()
    val intArray = IntArray(integer.toString().length)
    var index = 0
    for (i in integer.toString()) {
        intArray[index] = i.toString().toInt()
        index++
    }
    return intArray
}