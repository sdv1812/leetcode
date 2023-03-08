package com.sanskar.leet.code.arrays

class RotateArray {
    fun rotate(nums: IntArray, k: Int): Unit {
        val shift = k % nums.size
        val kArr = IntArray(shift)
        for ((kIdx, i) in (nums.size - shift until nums.size).withIndex()) {
            kArr[kIdx] = nums[i]
        }
        var i = nums.size - shift - 1
        var j = nums.size - 1
        while (i >= 0) {
            nums[j] = nums[i]
            j--
            i--
        }
        for (idx in kArr.indices) {
            nums[idx] = kArr[idx]
        }
    }
}

fun main() {
    val r = RotateArray()
    val arr1 = intArrayOf(1,2,3,4,5,6,7)
    val arr2 = intArrayOf(-1,-100,3,99)
    val arr3 = intArrayOf(-1)
    r.rotate(arr1, 3)
    r.rotate(arr2, 2)
    r.rotate(arr3, 1)
    arr1.print()
    arr2.print()
    arr3.print()
}