package com.sanskar.leet.code.arrays

class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        val sum = nums.reduce { acc, i -> acc + i }
        val seen = mutableMapOf<Int, Boolean>()
        var uniqueSum = 0
        for (i in nums.indices) {
            if (seen[nums[i]] == null) {
                seen[nums[i]] = true
                uniqueSum += nums[i]
            }
        }
        return 2 * uniqueSum - sum
    }

    fun singleNumberSet(nums: IntArray): Int {
        val sum = nums.reduce { acc, i -> acc + i }
        val numSet = mutableSetOf<Int>()
        for (i in nums) {
            numSet.add(i)
        }
        val uniqueSum = numSet.reduce { acc, i -> acc + i }
        return 2 * uniqueSum - sum
    }
}

fun main() {
    val s = SingleNumber()
    val arr1 = intArrayOf(2, 2, 1)
    val arr2 = intArrayOf(4, 1, 2, 1, 2)
    val arr3 = intArrayOf(1)
    println(s.singleNumber(arr1))
    println(s.singleNumber(arr2))
    println(s.singleNumber(arr3))

    printSeparator()

    println(s.singleNumberSet(arr1))
    println(s.singleNumberSet(arr2))
    println(s.singleNumberSet(arr3))
}