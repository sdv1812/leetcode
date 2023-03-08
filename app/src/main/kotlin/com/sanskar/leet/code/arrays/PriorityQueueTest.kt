package com.sanskar.leet.code.arrays

import java.util.PriorityQueue

class PriorityQueueTest {

    fun testPQ() {
        val arr = intArrayOf(5,4,6,3,7,2,9,1)
        val q = PriorityQueue<Int>()
        for (i in arr.indices) {
            q.add(arr[i])
        }
        for (i in 0 until q.size) {
            println(q.remove())
        }
        printSeparator()
        for (i in 0 until q.size) {
            println(q.poll())
        }
        println(q)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val pqTest = PriorityQueueTest()
            pqTest.testPQ()
        }
    }
}