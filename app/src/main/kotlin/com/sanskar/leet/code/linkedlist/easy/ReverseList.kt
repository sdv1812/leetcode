package com.sanskar.leet.code.linkedlist.easy

class ReverseList {

    fun reverseList(head: ListNode?): ListNode? {
        if (head?.next == null) {
            return head
        }
        val ptr = reverseList(head.next)
        head.next?.next = head
        head.next = null
        return ptr
    }

    fun reverseListWhileLoop(head: ListNode?): ListNode? {
        var ptr1: ListNode? = null
        var ptr2 = head
        while (ptr2 != null) {
            val temp = ptr2.next
            ptr2.next = ptr1
            ptr1 = ptr2
            ptr2 = temp
        }
        return ptr1
    }
}

fun main() {
    val r = ReverseList()
    val head2 = createLinkedList2(intArrayOf(1, 2, 3, 4, 5, 6, 7))
    printLinkedList(head2)
    val reversedList = r.reverseListWhileLoop(head2)
    printLinkedList(reversedList)
}