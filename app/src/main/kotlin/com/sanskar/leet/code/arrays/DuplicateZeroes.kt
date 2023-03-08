package com.sanskar.leet.code.arrays

class DuplicateZeroes {
    fun duplicateZeros(arr: IntArray) {
        // find the number of zeroes
        // create a new array with the length plus no of zeroes
        // starting from the end if a number is not zero, shift the number by number of zeroes, decrease the number of zeroes by 1.
        // if the number is zero, just add another zero to the right and decrease the number of zeroes by 1.


        val excess = arr.filter { it == 0 }.size
        val idx = arr.size - 1
        var lastIdx = idx + excess
        val res = IntArray(excess + arr.size)
        for (i in arr.size - 1 downTo 0 step 1) {
            if (arr[i] == 0) {
                res[lastIdx--] = 0
                res[lastIdx--] = 0
            } else {
                res[lastIdx--] = arr[i]
            }
        }
        for (i in arr.indices) {
            arr[i] = res[i]
        }
    }
}

fun main() {
    val d = DuplicateZeroes()
    val arr = listOf(0,1, 2, 3, 4, 0, 2, 0).toIntArray()
    d.duplicateZeros(arr)
    arr.print()
    // output (0,0,1,2,3,4,0,0), 2, 0,0
}

