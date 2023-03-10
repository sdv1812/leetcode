package com.sanskar.leet.code.linkedlist.easy

fun printLinkedList(head: ListNode?) {
    var headcopy = head
    while (headcopy != null) {
        print("${headcopy.value} ->")
        headcopy = headcopy.next
    }
    println()
}
