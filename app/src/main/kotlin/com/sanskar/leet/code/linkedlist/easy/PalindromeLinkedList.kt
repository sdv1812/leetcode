package com.sanskar.leet.code.linkedlist.easy

class PalindromeLinkedList {
    fun isPalindrome(head: ListNode?): Boolean {
        var original = head
        var mid = head
        var last = head
        while (last != null) {
            mid = mid?.next
            last = last.next?.next
        }
        var prev: ListNode? = null
        while (mid != null) {
            val temp = mid.next
            mid.next = prev
            prev = mid
            mid = temp
        }
        while (prev != null) {
            if (prev.`val` != original?.`val`) return false
            prev = prev.next
            original = original.next
        }
        return true
    }
}

fun main() {
    val p = PalindromeLinkedList()
    println(p.isPalindrome(createLinkedList2(intArrayOf(1, 2, 2, 1))))
    println(p.isPalindrome(createLinkedList2(intArrayOf(1, 2, 1, 2, 1))))
    println(p.isPalindrome(createLinkedList2(intArrayOf(1, 2, 1, 1))))
    println(p.isPalindrome(createLinkedList2(intArrayOf(1, 1, 1))))
    println(p.isPalindrome(createLinkedList2(intArrayOf(1, 2, 3))))
}