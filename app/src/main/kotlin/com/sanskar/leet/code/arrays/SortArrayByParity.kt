package com.sanskar.leet.code.arrays

class SortArrayByParity {
    fun sortArrayByParity(nums: IntArray): IntArray {
        var i = 0
        var j = nums.size - 1
        while (i < j) {
            if (nums[i]%2 == 1) {
                val t = nums[i]
                nums[i] = nums[j]
                nums[j] = t
                j--
            } else {
                i++
            }
        }
        return nums
    }
}

fun main() {
    val s = SortArrayByParity()
    val arr1 = intArrayOf(3,1,2,4)
    val arr2 = intArrayOf(0)
    val arr3 = intArrayOf(0,0,0,0)
    val arr4 = intArrayOf(4,3,2,1,0,5,22)
    s.sortArrayByParity(arr1)
    s.sortArrayByParity(arr2)
    s.sortArrayByParity(arr3)
    s.sortArrayByParity(arr4)
    arr1.print()
    arr2.print()
    arr3.print()
    arr4.print()
}