package com.sanskar.leet.code.arrays

class MaxConsecutiveOnes2 {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var i = 0
        var j = 0
        var lastZero = -1
        var z = 0
        var max = 0
        while (j < nums.size) {
            if (nums[j] == 0) {
                z++
                if (z <= 1) lastZero = j
            }
            if (z <=1) {
                j++
            } else {
                if (j - i > max) {
                    max = j - i
                }
                j = lastZero + 1
                i = lastZero + 1
                z = 0
            }
        }
        if (j - i > max) {
            max = j - i
        }
        return max
    }

//    fun findMaxConsecutiveOnesSlidingWindow(nums: IntArray): Int {
//        var i = 0
//        var j = 0
//
//    }
}

fun main() {
    val m = MaxConsecutiveOnes2()
    val arr1 = intArrayOf(1,0,1,1,0)
    val arr2 = intArrayOf(1,0,1,1,0,1)
    val arr3 = intArrayOf(1,0,0,1,0,1)
    val arr4 = intArrayOf(1,0,0,0,1,1,1,0,1)
    val arr5 = intArrayOf(1,0,0,0,1,1,1,0,0)
    println(m.findMaxConsecutiveOnes(arr1)) // 4
    println(m.findMaxConsecutiveOnes(arr2)) // 4
    println(m.findMaxConsecutiveOnes(arr3)) // 3
    println(m.findMaxConsecutiveOnes(arr4)) // 5
    println(m.findMaxConsecutiveOnes(arr5)) // 4
}