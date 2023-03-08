package com.sanskar.leet.code.arrays

class MoveZeroes {
    fun moveZeroes(nums: IntArray): Unit {
        var i = 0
        var j = 0
        while (j <nums.size) {
            if (nums[i] == 0 && nums[j] == 0) {
                j++
            } else if (nums[i] == 0 && nums[j] != 0){
                nums[i] = nums[j]
                nums[j] = 0
            } else {
                i++
                j++
            }
        }
    }
}

fun main() {
    val arr1 = intArrayOf(0,1,0,3,12)
    val arr2 = intArrayOf(0)
    val arr3 = intArrayOf(0,0,0,0,0)
    val m = MoveZeroes()
    m.moveZeroes(arr1)
    m.moveZeroes(arr2)
    m.moveZeroes(arr3)
    arr1.print()
    arr2.print()
    arr3.print()
}