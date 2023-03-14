package com.sanskar.leet.code.linkedlist.easy

class LinkedListCycle {
    fun hasCycle(head: ListNode?): Boolean {
        var ptr1 = head
        var ptr2 = head?.next?.next
        while (ptr2 != null) {
            if (ptr1 == ptr2) {
                return true
            }
            ptr1 = ptr1?.next
            ptr2 = ptr2.next?.next
        }
        return false
    }
}

fun main() {
    val l = LinkedListCycle()
    val head = ListNode(3)
    val second = ListNode(2)
    head.next = second
    head.next?.next = ListNode(0)
    head.next?.next?.next = ListNode(-4)
    head.next?.next?.next?.next = second
    println(l.hasCycle(head))
    println(l.hasCycle(createLinkedList2(intArrayOf(1,2,3,4,5))))
}