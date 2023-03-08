package com.sanskar.leet.code.arrays

class IntersectionOf2ArrayII {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        lateinit var smallArray: IntArray
        lateinit var bigArray: IntArray
        if (nums1.size > nums2.size) {
           smallArray = nums2
           bigArray = nums1
        } else {
            smallArray = nums1
            bigArray = nums2
        }
        val mapOfCount = mutableMapOf<Int, Int>()
        for (n in smallArray) {
            val count = mapOfCount[n]
            if (count != null) {
                mapOfCount[n] = count + 1
            } else {
                mapOfCount[n] = 1
            }
        }
        val res = IntArray(smallArray.size)
        var c = 0
        for (n in bigArray) {
            val count = mapOfCount[n]
            if (count != null && count > 0) {
                mapOfCount[n] = count - 1
                res[c++] = n
            }
        }
        return res.sliceArray(0 until c)
    }
}

fun main() {
    val i = IntersectionOf2ArrayII()
    val arr1 = i.intersect(intArrayOf(1,2,2,1), intArrayOf(2,2))
    val arr2 = i.intersect(intArrayOf(4,9,5), intArrayOf(9,4,9,8,4))
    arr1.print()
    arr2.print()
}