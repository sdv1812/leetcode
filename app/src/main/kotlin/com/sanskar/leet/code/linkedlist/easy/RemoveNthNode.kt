package com.sanskar.leet.code.linkedlist.easy

class RemoveNthNode {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var i = 0
        var j = 0
        val dummy = ListNode(0, head)
        var ptr1: ListNode? = dummy
        var ptr2 = head
        while (ptr2!!.next != null) {
            if (j >= n - 1) {
                i++
                ptr1 = ptr1?.next
            }
            ptr2 = ptr2.next
            j++
        }
        ptr1?.next = ptr1?.next?.next
        return dummy.next
    }
}

fun main() {
    val r = RemoveNthNode()

    val head2 = createLinkedList2(intArrayOf(1, 2, 3, 4, 5, 6, 7))
    printLinkedList(head2)
    val removedHead2 = r.removeNthFromEnd(head2, 2)
    printLinkedList(removedHead2)

    val head3 = createLinkedList2(intArrayOf(1))
    printLinkedList(head3)
    val removedHead3 = r.removeNthFromEnd(head3, 1)
    printLinkedList(removedHead3)

    val head4 = createLinkedList2(intArrayOf(1, 2))
    printLinkedList(head4)
    val removedHead4 = r.removeNthFromEnd(head4, 1)
    printLinkedList(removedHead4)
//
    val head5 = createLinkedList2(intArrayOf(1, 2, 3, 4, 5, 6, 7))
    printLinkedList(head5)
    val removedHead5 = r.removeNthFromEnd(head5, 7)
    printLinkedList(removedHead5)

}