package com.sanskar.leet.code.strings.easy

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        val smallest = strs.minBy { it.length }
        val arr = CharArray(smallest.length)
        var count = 0
        smallest.forEachIndexed { index, c ->
            var same = true
            strs.forEach { str ->
                if (str[index] != c) same = false
            }
            if (same) {
                arr[index] = c
                count++
            } else {
                return String(arr.sliceArray(0 until count))
            }
        }
        return String(arr)
    }
}

fun main() {
    val l = LongestCommonPrefix()
    println(l.longestCommonPrefix(arrayOf("flower","flow","flight")))
}