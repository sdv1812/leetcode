package com.sanskar.leet.code.strings.easy

import com.sanskar.leet.code.arrays.printSeparator

class FirstUniqueChar {
    fun firstUniqChar(s: String): Int {
        val map = mutableMapOf<Char, CharacterCountIndex>()
        s.forEachIndexed { index, c ->
            val characterCountIndex = map[c]
            if (characterCountIndex == null) {
                map[c] = CharacterCountIndex(1, index)
            } else {
               characterCountIndex.count = characterCountIndex.count + 1
               characterCountIndex.index = index
            }
        }
        val res = map.filterValues { it.count == 1 }.entries.firstOrNull()?.value?.index
        return res ?: -1
    }

     class CharacterCountIndex(var count: Int, var index: Int) {
         override fun toString(): String {
             return "{count = $count, index = $index}"
         }
     }

    fun firstUniqCharCharArr(s: String): Int {
        val charArr = IntArray(123) {0}
        for (ch in s) {
            charArr[ch.toInt()] += 1
        }
        s.forEachIndexed { index, c ->
             if (charArr[c.code] == 1) return index
        }
        return -1
    }
}

fun main() {
    val f = FirstUniqueChar()
    println(f.firstUniqChar("leetcode"))
    println(f.firstUniqChar("loveleetcode"))
    println(f.firstUniqChar("aabb"))
    printSeparator()
    println(f.firstUniqCharCharArr("leetcode"))
    println(f.firstUniqCharCharArr("loveleetcode"))
    println(f.firstUniqCharCharArr("aabb"))
}