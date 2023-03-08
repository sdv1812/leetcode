package com.sanskar.leet.code.arrays

class RemoveElement {
    fun removeElement(nums: IntArray, value: Int): Int {
        var len = nums.size
        if (len == 0) {
            return 0
        }
        if (nums[len - 1] == value) {
            len--
        }
        for (i in len - 1 downTo 0 step 1) {
            if (nums[i] == value) {
                len--
                //shift remaining
                for (j in i until len) {
                    nums[j] = nums[j + 1]
                }

            }
        }
        return len
    }

    fun removeElement2Ptr(nums: IntArray, value: Int): Int {
        var j = 0
        var i = 0
        while (j < nums.size) {
            if (nums[j] != value) {
                nums[i] = nums[j]
                i++
            }
            j++
        }
        return i
    }

    fun removeElementSwap(nums: IntArray, value: Int): Int {
        var lastIdx = nums.size - 1
        var startIdx = 0
        while (startIdx < lastIdx) {
            if (nums[startIdx] == value) {
                val t = nums[startIdx]
                nums[startIdx] = nums[lastIdx]
                nums[lastIdx] = t
                lastIdx--
            } else {
                startIdx++
            }
        }
        nums.print()
        return startIdx + 1
    }
}

fun main() {
    val r = RemoveElement()
//    println(r.removeElement(intArrayOf(3, 2, 2, 3), 3))
//    println(r.removeElement(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2))
//    println(r.removeElement(intArrayOf(4, 5), 4))
//    printSeparator()
//    println(r.removeElement2Ptr(intArrayOf(3, 2, 2, 3), 3))
//    println(r.removeElement2Ptr(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2))
//    println(r.removeElement2Ptr(intArrayOf(4, 5), 4))
//    printSeparator()
    println(r.removeElementSwap(intArrayOf(3, 2, 2, 3), 3))
    println(r.removeElementSwap(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2))
    println(r.removeElementSwap(intArrayOf(4, 5), 4))
}