package com.sanskar.leet.code.strings.easy

class NeedleInHaystack {
    fun strStr(haystack: String, needle: String): Int {
        val needleLen = needle.length
        var i = 0
        var j = needleLen - 1
        while (j < haystack.length) {
            val str = haystack.substring(i..j)
            if (str == needle) return i
            i++
            j++
        }
        return -1
    }
}

fun main() {
    val n = NeedleInHaystack()
    println(n.strStr("sadbutsad", "sad"))
    println(n.strStr("leetcode", "leeto"))
}