package com.example.algoritms.easy

fun main() {
    val intArray = IntArray(4)
    intArray[0] = -1
    intArray[1] = -3
    intArray[2] = -5
    intArray[3] = -6
    println(searchInsert(intArray, -2))
}

fun searchInsert(numbers: IntArray, target: Int): Int {
    var integer = numbers.indexOf(target)
    if (integer == -1) {
        var number = 0
        for (i in numbers) {
            if (i < target) {
                number = i
            }
        }

        integer = if (number < 0 ) {
            numbers.indexOf(number) - 1
        } else {
            numbers.indexOf(number) + 1
        }

        if (number == -1) {
            integer = numbers.indexOf(number) - 1
        }

    }
    return integer
}