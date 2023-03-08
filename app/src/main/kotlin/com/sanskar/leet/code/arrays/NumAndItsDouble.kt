package com.sanskar.leet.code.arrays

class NumAndItsDouble {
    fun checkIfExist(arr: IntArray): Boolean {
        val numMap = mutableMapOf<Int, Int>()
        arr.forEachIndexed { index, i -> numMap[i] = index }
        arr.forEachIndexed { index, i ->
            if (numMap[2 * i] != null && numMap[2 * i] != index) {
                return true
            }
        }
        return false
    }
}

fun main() {
    val n = NumAndItsDouble()
//    println(n.checkIfExist(intArrayOf(10,2,5,3)))
    println(n.checkIfExist(intArrayOf(-2,0,10,-19,4,6,-8)))
    println(n.checkIfExist(intArrayOf(0,0)))
}