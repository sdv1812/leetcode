package com.sanskar.leet.code.strings.easy

class ReverseString {
    fun reverseString(s: CharArray): Unit {
        var i = 0
        var j = s.size - 1
        var t: Char
        while (i < j) {
            t = s[i]
            s[i] = s[j]
            s[j] = t
            i++
            j--
        }
    }
}

fun main() {
    val s = charArrayOf('h', 'e', 'l', 'l', 'o')
    println(s)
    val r = ReverseString()
    r.reverseString(s)
    println(s)
}

