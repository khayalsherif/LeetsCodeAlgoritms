package com.example.algoritms.easy

/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.
More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
It does not matter what you leave beyond the first k elements.
Return k after placing the final result in the first k slots of nums.
Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
*/

fun main() {
    val intArray = IntArray(5)
    intArray[0] = 1
    intArray[1] = 1
    intArray[2] = 1
    intArray[3] = 1
    intArray[4] = 5

    println(removeDuplicates(intArray))
}

private fun removeDuplicates(numbers: IntArray): Int {
    var integer = 0
    val cloneIntList = ArrayList<Int>()
    for (i in numbers) {
        val intList = numbers.filter { it == i }
        if (intList.size == 1) {
            integer++
        } else if (cloneIntList.none { it == i }) {
            integer++
        }
        cloneIntList.add(i)
    }
    return integer
}