package com.example.algoritms.easy

// VariableIndex1 increases one every one cycle, but every time increases one variableIndex2.
// If they(variableIndex1,variableIndex2) intersects then variableIndex2 increases one

fun main() {
    val array = IntArray(4)
    array[0] = 2
    array[1] = 5
    array[2] = 5
    array[3] = 11
    println(twoSum(array, 10))
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val array = IntArray(2)
    var variableIndex1 = 0
    var variableIndex2 = 1
    while (true) {
        if (variableIndex1 == nums.size - 1 && variableIndex2 == nums.size - 1) {
            break
        } else {
            if (variableIndex2 != nums.size) {
                if (nums[variableIndex1] + nums[variableIndex2] == target && variableIndex1 != variableIndex2) {
                    array[0] = variableIndex1
                    array[1] = variableIndex2
                    break
                } else {
                    variableIndex2++
                }
            } else {
                variableIndex1++
                variableIndex2 = 0
            }
        }
    }
    return array

}