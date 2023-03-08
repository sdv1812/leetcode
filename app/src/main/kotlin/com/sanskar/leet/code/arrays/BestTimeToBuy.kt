package com.sanskar.leet.code.arrays

import kotlin.RuntimeException

class BestTimeToBuy {
    fun maxProfit(prices: IntArray): Int {
        var i = 0
        var j = 1
        var sum = 0
        while (j < prices.size) {
            if (prices[j] - prices[i] > 0) {
                sum += prices[j] - prices[i]
            }
            j++
            i++
        }
        return sum
    }
}

fun main() {
    val b = BestTimeToBuy()
    val arr1 = intArrayOf(7, 1, 5, 3, 6, 4)
    val arr2 = intArrayOf(1, 2, 3, 4, 5)
    val arr3 = intArrayOf(7, 6, 4, 3, 1)

    println(b.maxProfit(arr1))
    println(b.maxProfit(arr2))
    println(b.maxProfit(arr3))
}