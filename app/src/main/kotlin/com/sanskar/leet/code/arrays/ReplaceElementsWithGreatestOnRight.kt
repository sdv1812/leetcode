package com.sanskar.leet.code.arrays

class ReplaceElementsWithGreatestOnRight {
    fun replaceElements(arr: IntArray): IntArray {
        var max = -1
        for (i in arr.size - 1 downTo 0 step 1) {
            val t = arr[i]
            arr[i] = max
            if (t > max) {
                max = t
            }
        }
        return arr
    }
}

fun main() {
    /*
    17,18,5,4,6,1   i = 5, max = -1,
    17,18,5,4,6,1   i = 4, max = 1
    17,18,5,4,1,-1  i = 3, max = 6
    17,18,5,6,1,-1  i = 2, max = 6
    17,18,6,6,1,-1  i = 1, max = 6
    17,6,6,6,1,-1   i = 0, max = 18
    18,6,6,6,1,-1

    18,6,6,6,1,-1
     */

    val r = ReplaceElementsWithGreatestOnRight()
    println(r.replaceElements(intArrayOf(17,18,5,4,6,1 )).print())
    println(r.replaceElements(intArrayOf(17)).print())
}