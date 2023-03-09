package com.sanskar.leet.code.strings.easy

import java.lang.NumberFormatException

class AtoI {
    fun myAtoi(s: String): Int {
        val s2 = s.trim()
        if (s2.isEmpty()) return 0
        val firstChar = s2[0]
        if (!firstChar.isDigit() && firstChar != '-' && firstChar != '+') {
            return 0
        }
        val secondChar = s[1] // has to be a number
        if (!secondChar.isDigit()) return 0
        val nums = CharArray(s.length)
        var index = 0
        for (i in s.indices) {
            if ((s[i].isDigit()) || (index == 0 && s[i] == '-' && i+1 < s.length && s[i+1].isDigit())) {
                nums[index] = s[i]
                index++
            } else {
                if (index != 0) break
            }
        }
        return try {
            val numStr = String(nums.sliceArray(0 until index))
            if (numStr.isEmpty()) 0 else numStr.toInt()
        } catch (e: NumberFormatException) {
            e.printStackTrace()
            if (nums[0] == '-') Int.MIN_VALUE else Int.MAX_VALUE
        }
    }
}

fun main() {
    val a = AtoI()
    println(a.myAtoi("42"))
    println(a.myAtoi("   -42"))
    println(a.myAtoi("4193 with words"))
    println(a.myAtoi("asd 4193"))
    println(a.myAtoi("-+42"))
    println(a.myAtoi("-+"))
}