package com.sanskar.leet.code.arrays

import java.util.PriorityQueue
import kotlin.math.max

class ThirdMax {
    fun thirdMax(nums: IntArray): Int {
        var low = Int.MIN_VALUE
        var isLowPresent = false
        var med = Int.MIN_VALUE
        var high = Int.MIN_VALUE

        for (i in nums.indices) {
            if (nums[i] >= high) {
                high = nums[i]
            }
        }

        for (i in nums.indices) {
            if (nums[i] in med until high) {
                med = nums[i]
            }
        }

        for (i in nums.indices) {
            if (nums[i] in low until med) {
                low = nums[i]
                isLowPresent = true
            }
        }
        return if (isLowPresent) low else high
    }

    fun thirdMax2(nums: IntArray): Int {
        var low: Int? = null
        var med: Int? = null
        var high: Int? = null

        for (i in nums.indices) {
            if (nums[i] != low && nums[i] != med && nums[i] != high) {
                if (high == null || nums[i] >= high) {
                    low = med
                    med = high
                    high = nums[i]
                } else if (med == null || nums[i] >= med) {
                    low = med
                    med = nums[i]
                } else if (low == null || nums[i] >= low) {
                    low = nums[i]
                }
            }
        }
        return low ?: high!!
    }

    fun thirdMaxQueue(nums: IntArray): Int {
        val top3 = PriorityQueue<Int>()
        val seen = HashSet<Int>()
        for (i in nums.indices) {
            if (!seen.contains(nums[i])) {
                if (top3.size < 3) {
                    top3.add(nums[i])
                    seen.add(nums[i])
                } else {
                    if (top3.peek() < nums[i]) {
                        top3.poll()
                        top3.add(nums[i])
                        seen.add(nums[i])
                    }
                }
            }
        }
        return when (top3.size) {
            2 -> {
                val firstNum = top3.poll()
                max(firstNum, top3.peek())
            }

            else -> {
                top3.peek()
            }
        }
    }
}

fun main() {
    val t = ThirdMax()
    val arr1 = intArrayOf(3, 2, 1)
    val arr2 = intArrayOf(1, 2)
    val arr3 = intArrayOf(2, 2, 3, 1)
    val arr4 = intArrayOf(1, 2, 2, 5, 3, 5)

    println(t.thirdMax(arr1))
    println(t.thirdMax(arr2))
    println(t.thirdMax(arr3))

    println(t.thirdMaxQueue(arr1))
    println(t.thirdMaxQueue(arr2))
    println(t.thirdMaxQueue(arr3))

    println(t.thirdMax2(arr1))
    println(t.thirdMax2(arr2))
    println(t.thirdMax2(arr3))
    println(t.thirdMax2(arr4))

}