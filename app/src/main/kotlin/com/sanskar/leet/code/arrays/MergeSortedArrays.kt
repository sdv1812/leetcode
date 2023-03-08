package com.sanskar.leet.code.arrays

class MergeSortedArrays {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        // find if m is bigger or n. Use the bigger one as the base loop.
        var mIdx = m - 1
        var nIdx = n - 1
        var lastIdx = m + n - 1
        while (mIdx >-1 && nIdx > -1) {
            if (nums1[mIdx] > nums2[nIdx]) {
                nums1[lastIdx--] = nums1[mIdx]
                mIdx--
            } else {
                nums1[lastIdx--] = nums2[nIdx]
                nIdx--
            }
        }
        if (nIdx > -1) {
            for (i in 0..nIdx) {
                nums1[i] = nums2[i]
            }
        }
        nums1.print()
    }
}
/*
1,2,3,4,5,6,0,0,0,
2,5,6

, 2, 3,4, 5,5,6,6

 */

fun main() {
    val m = MergeSortedArrays()
    m.merge(intArrayOf( 2, 3, 4, 0, 0, 0), 3, intArrayOf(1, 4,5 ), 3)
}