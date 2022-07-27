package com.example.algoritms.easy

//---------------------------------------------------------------------------
fun main() {
    val array = IntArray(3)
    array[0] = 3
    array[1] = 2
    array[2] = 3

    println(twoSum(array, 5).toList().toString())
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val sumList = IntArray(2)
    var lastIndex = 0
    var nextIndex = 1
    println(nums.indices)
    return sumList
}


fun twoSum2(nums: IntArray, target: Int): IntArray? {
    val map: MutableMap<Int, Int> = HashMap()
    for (i in nums.indices) {
        val complement = target - nums[i]
        if (map.containsKey(complement)) {
            return intArrayOf(map[complement]!!, i)
        }
        map[nums[i]] = i
    }
    // In case there is no solution, we'll just return null
    return null
}
/*
    while (true) {
        if (array.size - 1 != nextIndex) {
            if (array[lastIndex] + array[nextIndex] == sum) {
                sumList[0] = lastIndex
                sumList[1] = nextIndex
                break
            } else if (nextIndex == array.size - 1) {
                lastIndex++
            } else {
                nextIndex++
            }
        } else {
            break
        }
    }
 */