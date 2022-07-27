package com.example.algoritms.easy

fun main() {
    val intArray = IntArray(4)
    intArray[0] = 3
    intArray[1] = 2
    intArray[2] = 2
    intArray[3] = 3

    println(removeElement(intArray, 3))
}

fun removeElement(numbers: IntArray, number: Int): Int {
    val cleanList = ArrayList<Int>()
    for (i in numbers) {
        if (i != number) {
            cleanList.add(i)
        }
    }
    return cleanList.size
}