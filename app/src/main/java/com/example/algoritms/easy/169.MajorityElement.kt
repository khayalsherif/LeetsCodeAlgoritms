package com.example.algoritms.easy

fun main() {
    val array = IntArray(5)
    array[0] = 2
    array[1] = 5
    array[2] = 2
    array[3] = 4
    array[4] = 5

    println(majorityElement(array))
}

fun majorityElement(nums: IntArray): Int {
    var number = 0
    var numberCount = 0
    for (i in nums) {
        val filter = nums.partition { it == i }.first
        if (filter.size > numberCount) {
            numberCount = filter.size
            number = i
        }
    }
    return number
}