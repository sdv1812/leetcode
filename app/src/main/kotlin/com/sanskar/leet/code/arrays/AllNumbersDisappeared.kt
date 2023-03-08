package com.sanskar.leet.code.arrays

class AllNumbersDisappeared {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val compareArr = IntArray(nums.size + 1)
        nums.forEach { compareArr[it] = it }
        val list = ArrayList<Int>()
        for (i in 1 until compareArr.size) {
            if (compareArr[i] == 0) {
                list.add(i)
            }
        }
        return list
    }
}

fun main() {
    val arr1 = intArrayOf(3, 2, 1)
    val arr2 = intArrayOf(4,3,2,7,8,2,3,1)

    val a = AllNumbersDisappeared()
    println(a.findDisappearedNumbers(arr1))
    println(a.findDisappearedNumbers(arr2))

}