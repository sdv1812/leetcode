package com.sanskar.leet.code.strings.easy

class Anagram {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val arr = IntArray(26)
        for (i in s.indices) {
            arr[s[i] - 'a']++
            arr[t[i] - 'a']--
        }
        arr.forEach { if(it != 0) return false }
        return true
    }
}

fun main() {
    val a = Anagram()
    println(a.isAnagram("anagram", "nagaram"))
    println(a.isAnagram("rat", "car"))
}