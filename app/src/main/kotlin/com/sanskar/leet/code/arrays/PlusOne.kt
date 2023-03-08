package com.sanskar.leet.code.arrays

class PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        var carry = 1
        var current = digits.size - 1
        do {
            val sum = digits[current] + carry
            if (sum == 10) {
                carry = 1
                digits[current] = 0
            } else {
                digits[current] = sum
                break
            }
            current--
        } while (current >= 0 )
        if (current == -1 && digits[0] == 0) {
            val arr = IntArray(digits.size + 1)
            for (i in arr.size - 1 downTo 2) {
                arr[i] = digits[i - 1]
            }
            arr[0] = 1
            arr[1] = 0
            return arr
        }
        return digits
    }
}

fun main() {
    val p = PlusOne()
//    p.plusOne(intArrayOf(1, 2, 3)).print()
//    p.plusOne(intArrayOf(4, 3, 2, 1)).print()
    p.plusOne(intArrayOf(8,9,9,9)).print()
    p.plusOne(intArrayOf(9,9,9,9)).print()
    p.plusOne(intArrayOf(9,9,9)).print()
    p.plusOne(intArrayOf(9)).print()
}