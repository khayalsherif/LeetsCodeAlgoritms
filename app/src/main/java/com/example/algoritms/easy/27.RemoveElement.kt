package com.example.algoritms.easy

/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

 */
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