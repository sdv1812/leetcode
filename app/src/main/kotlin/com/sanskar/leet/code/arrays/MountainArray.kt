package com.sanskar.leet.code.arrays

class MountainArray {
    fun validMountainArray(arr: IntArray): Boolean {
        // find peak
        // go left of the peak to assert strictInc
        // go right to assert strictDec
        if (arr.size < 3) return false
        var peak = Int.MIN_VALUE
        var peakIdx = 0
        arr.forEachIndexed { index, i ->
            if (i > peak) {
                peak = i
                peakIdx = index
            }
        }
        if (peakIdx == 0 || peakIdx == arr.size - 1) return false

        var strictDec = true;
        for (i in peakIdx until arr.size - 1) {
            if (arr[i] <= arr[i+1]) {
                strictDec = false;
            }
        }

        var strictInc = true;
        for (i in 0 until peakIdx - 1) {
            if (arr[i] >= arr[i+1]) {
                strictInc = false;
            }
        }

        return strictDec && strictInc
    }
}

fun main() {
    val m = MountainArray()
    println(m.validMountainArray(intArrayOf(2,1)))
    println(m.validMountainArray(intArrayOf(3,5,5)))
    println(m.validMountainArray(intArrayOf(0,3,2,1)))
}