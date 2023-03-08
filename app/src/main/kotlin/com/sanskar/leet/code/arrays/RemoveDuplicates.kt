package com.sanskar.leet.code.arrays

class RemoveDuplicates {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 1
        var j = 0
        if (nums.size <= 1) {
            return nums.size
        }
        while (j < nums.size - 1) {
            if (nums[j] != nums[j+1]) {
                nums[i] = nums[j + 1]
                i ++
            }
            j++
        }
        return i
    }
}

fun main() {
    val r = RemoveDuplicates()
    println(r.removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4)))
}
/*
        0,0,0,1,1,1,2,2,3,3,4
        0,1,0,1,1,1,2,2,3,3,4
        0,1,2,1,1,1,2,2,3,3,4
        0,1,2,3,1,1,2,2,3,3,4
        0,1,2,3,4,1,2,2,3,3,4

 */