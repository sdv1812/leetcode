package com.sanskar.leet.code.arrays

class ContainsDuplicateUnSorted {
    fun containsDuplicate(nums: IntArray): Boolean {
        val seen = mutableMapOf<Int, Boolean>()
        for (i in nums.indices) {
            if (seen[nums[i]] == null) {
                seen[nums[i]] = true
            } else {
                return true
            }
        }
        return false
    }
}

fun main() {
    val arr1 = intArrayOf(1,2,3,1)
    val arr2 = intArrayOf(1,2,3,4)
    val arr3 = intArrayOf(1,1,1,3,3,4,3,2,4,2)
    val c = ContainsDuplicateUnSorted()
    println(c.containsDuplicate(arr1))
    println(c.containsDuplicate(arr2))
    println(c.containsDuplicate(arr3))
}