package com.sanskar.leet.code.linkedlist.easy

fun printLinkedList(head: ListNode?) {
    var headcopy = head
    while (headcopy != null) {
        print("${headcopy.value} ->")
        headcopy = headcopy.next
    }
    println()
}

fun createLinkedList(arr: IntArray): ListNode? {
    val head = if (arr.isEmpty()) null else ListNode(arr[0])
    head ?: return null
    var ptr = head
    for (i in 1 until arr.size) {
        ptr?.next = ListNode(arr[i], null)
        ptr = ptr?.next
    }
    return head
}

fun createLinkedList2(arr: IntArray): ListNode? {
    var head : ListNode? = null
    var nextNode: ListNode?
    for (i in arr.size - 1 downTo 0) {
        nextNode = head
        head = ListNode(arr[i], nextNode)
    }
    return head
}