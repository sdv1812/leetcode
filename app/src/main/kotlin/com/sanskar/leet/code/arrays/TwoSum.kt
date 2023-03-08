package com.sanskar.leet.code.arrays

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val mapOfNumbers = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, n -> mapOfNumbers[n] = index }
        val res = IntArray(2)
        nums.forEachIndexed { index, i ->
            val numberToFind = target - i
            val idx = mapOfNumbers[numberToFind]
            if (idx != null && idx != index) {
                return intArrayOf(index, idx)
            }
        }
        return intArrayOf()
    }
}

fun main() {
    val t = TwoSum()
    t.twoSum(intArrayOf(2,7,11,15), 9).print()
    t.twoSum(intArrayOf(3,2,4), 6).print()
    t.twoSum(intArrayOf(3,3), 6).print()
}