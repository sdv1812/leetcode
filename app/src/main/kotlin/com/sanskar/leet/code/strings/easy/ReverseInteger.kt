package com.sanskar.leet.code.strings.easy

import kotlin.math.pow

class ReverseInteger {
    fun reverse(x: Int): Int {
        var reversedNum = 0
        var num = x
        while (num != 0) {
            val lastDigit = num % 10
            if (reversedNum > Integer.MAX_VALUE/10 || (reversedNum == Integer.MAX_VALUE / 10 && lastDigit > 7)) return 0
            if (reversedNum < Integer.MIN_VALUE/10 || (reversedNum == Integer.MIN_VALUE / 10 && lastDigit < -8)) return 0
            reversedNum = reversedNum * 10 + lastDigit
            num /= 10
        }
        return reversedNum
    }
}

fun main() {
    val x = -321
    val r = ReverseInteger()
    val y = 2.0.pow(10).toInt()
    println(r.reverse(x))
    println(r.reverse(y))
}