package com.example.algoritms.easy

//---------------------------------------------------------------------------
fun main() {
    val intArray = IntArray(3)
    intArray[0] = 1
    intArray[1] = 1
    intArray[2] = 2

    println(removeDuplicates(intArray))
}

private fun removeDuplicates(numbers: IntArray): Int {
    val hashSet = HashSet<Int>()
    for (i in numbers) {
        hashSet.add(i)
    }
    return hashSet.count()
}