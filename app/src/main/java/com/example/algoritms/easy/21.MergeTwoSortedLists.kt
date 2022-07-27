package com.example.algoritms.easy

//---------------------------------------------------------------------------
fun main() {
    val list1 = arrayListOf(90,1, 4, 2, 6, 9, 2, 3)
    val list2 = arrayListOf(4, 5, 6, 1)
    println(mergeTwoLists(list1, list2))
}

fun mergeTwoLists(list1: ArrayList<Int>?, list2: ArrayList<Int>?): List<Int> {
    val mergeList = ArrayList(list1) + ArrayList(list2)
    return mergeList.toList().sortedDescending().reversed()
}