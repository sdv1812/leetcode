package com.sanskar.leet.code.linkedlist.easy

class DeleteNode(var head: ListNode) {

    fun deleteNode(node: ListNode?) {
        if (node == null) return
        if (node.next == null) return
        node.value = node.next!!.value
        node.next = node.next!!.next
    }
}

fun main() {
    val head = ListNode(1)
    head.next = ListNode(2)
    head.next!!.next = ListNode(3)
    head.next!!.next!!.next = ListNode(4)
    head.next!!.next!!.next!!.next = ListNode(5)
    printLinkedList(head)
    val d = DeleteNode(head)
    d.deleteNode(head.next!!.next)
    printLinkedList(head)

}