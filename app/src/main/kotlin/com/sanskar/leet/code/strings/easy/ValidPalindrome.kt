package com.sanskar.leet.code.strings.easy

class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        val arr = CharArray(s.length)
        var len = 0
        s.forEach {
            if (it in ('a'..'z') || it in ('0'..'9')) {
                arr[len] = it
                len++
            } else if (it in ('A'..'Z')) {
                arr[len] = it + 32
                len++
            }
        }
        var i = 0
        var j = len - 1

        while (i < j) {
            if (arr[i] != arr[j]) {
                return false
            }
            i++
            j--
        }
        return true
    }
}

fun main() {
    val p = ValidPalindrome()
    println(p.isPalindrome("A man, a plan, a canal: Panama"))
    println(p.isPalindrome("race a car"))
    println(p.isPalindrome("0P"))
}