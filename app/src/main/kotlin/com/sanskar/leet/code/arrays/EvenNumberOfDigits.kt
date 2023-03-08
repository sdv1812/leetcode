package com.sanskar.leet.code.arrays

class EvenNumberOfDigits {
    fun findNumbers(nums: IntArray): Int {
        var count = 0;
        nums.forEach {
            val digits = "$it".length
            count += if (digits % 2 == 0) 1 else 0
        }
        return count
    }
}