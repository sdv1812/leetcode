package com.sanskar.leet.code.arrays

import kotlin.math.max

class MaxConsecutiveOnes {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var count = 0
        var max = 0
        var i = 0
        while (i < nums.size) {
            if (nums[i] == 1) {
                count ++
                max = max(count, max)
            } else {
                count = 0
            }

            i++
        }
        return max
    }

}

fun main() {
    var maxConsecutiveOnes = MaxConsecutiveOnes()
    println(maxConsecutiveOnes.findMaxConsecutiveOnes(listOf(1,1,1,1,1,1, 1, 1,1,1,1,1,1,1,1,1).toIntArray()))
}