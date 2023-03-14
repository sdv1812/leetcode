package com.sanskar.leet.code.linkedlist.easy

class MergeLists {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var ptr1 = list1
        var ptr2 = list2
        if (ptr1 == null) return ptr2
        if (ptr2 == null) return ptr1
        var prev = ListNode(-1)
        val head: ListNode = if (ptr1.`val`  < ptr2.`val`) ptr1 else ptr2
        while (ptr1 != null && ptr2 != null) {
            if (ptr1.`val` < ptr2.`val`) {
                val temp = ptr1
                ptr1 = ptr1.next
                temp.next = ptr2
                prev.next = temp
                prev = temp
            } else {
                val temp = ptr2
                ptr2 = ptr2.next
                temp.next = ptr1
                prev.next = temp
                prev = temp
            }
        }
        return head
    }
}

fun main() {
    val m = MergeLists()
    val head = m.mergeTwoLists(createLinkedList2(intArrayOf(1, 2, 4)), createLinkedList2(intArrayOf(1, 3, 4)))
    printLinkedList(head)
}