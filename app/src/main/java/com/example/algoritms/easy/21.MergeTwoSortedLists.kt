package com.example.algoritms.easy


/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
 */

fun main() {
    val list1 = arrayListOf(90,1, 4, 2, 6, 9, 2, 3)
    val list2 = arrayListOf(4, 5, 6, 1)
    println(mergeTwoLists(list1, list2))
}

fun mergeTwoLists(list1: ArrayList<Int>?, list2: ArrayList<Int>?): List<Int> {
    val mergeList = ArrayList(list1) + ArrayList(list2)
    return mergeList.toList().sortedDescending().reversed()
}