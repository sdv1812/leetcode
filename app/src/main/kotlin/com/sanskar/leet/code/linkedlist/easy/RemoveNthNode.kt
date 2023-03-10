package com.sanskar.leet.code.linkedlist.easy

class RemoveNthNode {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var i = 0
        var j = 0
        var ptr1 = head
        var ptr2 = head
        while (ptr2?.next != null) {
            if (j >= n - 1) {
                i++
                ptr1 = ptr1?.next
            }
            ptr2 = ptr2.next
            j++
        }
        // delete ptr1
        ptr1?.value = ptr1?.next?.value!!
        ptr1.next = ptr1.next!!.next

        return head
    }
}

fun main() {
    val r = RemoveNthNode()
    val head = createLinkedList(intArrayOf(1, 2, 3, 4, 5))
    printLinkedList(head)

    val head2 = createLinkedList2(intArrayOf(1, 2, 3, 4, 5, 6, 7))
    printLinkedList(head2)
    val removedHead = r.removeNthFromEnd(head2, 2)
    printLinkedList(removedHead)
}