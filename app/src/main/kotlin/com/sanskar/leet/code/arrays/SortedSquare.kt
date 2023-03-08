package com.sanskar.leet.code.arrays

import kotlin.math.abs

class SortedSquare {
    fun sortedSquares(nums: IntArray): IntArray {
        var start = 0
        var end = nums.size - 1
        val res = IntArray(nums.size)
        var i = end
        // find the point where positive numbers start
        // we have 2 arrays in descending/ascending order
        // merge the 2 arrays.
        while (start < end) {
            if (abs(nums[start]) > abs(nums[end])) {
                res[i--] = nums[start] * nums[start]
                start++
            } else {
                res[i--] = nums[end] * nums[end]
                end--
            }
        }
        if (start == end) {
            res[0] = nums[start] * nums[start]
        }
        return res
    }
}

fun main() {
    val s = SortedSquare()
//    s.sortedSquares(listOf(-7,-3,3,11).toIntArray()).forEach { println(it) }
    s.sortedSquares(listOf(-4,-1,0,3,10).toIntArray()).forEach { println(it) }
}