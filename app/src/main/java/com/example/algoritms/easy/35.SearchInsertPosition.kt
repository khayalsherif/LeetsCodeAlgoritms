package com.example.algoritms.easy

//---------------------------------------------------------------------------
fun main() {
    val intArray = IntArray(4)
    intArray[0] = -3
    intArray[1] = -1
    intArray[2] = 3
    intArray[3] = 90
    println(
        searchInsert(intArray, -6)
    )
}

fun searchInsert(nums: IntArray, target: Int): Int {
    var integer = nums.indexOf(target)
    if (integer == -1 && nums[0] < target && nums.last() > target) {
        var number = 0
        for (i in nums) {
            if (i < target) {
                number = i
            }
        }
        integer = if (number < 0 || number == 0) {
            nums.indexOf(number) + 1
        } else {
            if (number < 0) {
                nums.size - nums.indexOf(number)
            } else {
                nums.indexOf(number) + 1
            }
        }

    } else {
        integer = 0
    }
    return integer
}