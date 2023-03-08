package com.sanskar.leet.code.arrays

class HeightChecker {
    fun heightChecker(heights: IntArray): Int {
        val expected = heights.sortedArray()
        var count = 0
        heights.forEachIndexed { index, i -> if (i!=expected[index]) count++ }
        return count
    }
}

fun main() {
    val arr1 = intArrayOf(1,2,3,4,5)
    val arr2 = intArrayOf(1,1,4,2,1,3)
    val arr3 = intArrayOf(5,1,2,3,4)

    val h = HeightChecker()
    println(h.heightChecker(arr1))
    println(h.heightChecker(arr2))
    println(h.heightChecker(arr3))
}