package com.sanskar.leet.code.trees.easy

fun insertLevelOrder(arr: IntArray, i: Int): TreeNode? {
    var root: TreeNode? = null
    if (i < arr.size) {
        root = TreeNode(arr[i])
        root.left = insertLevelOrder(arr, 2 * i + 1)
        root.right = insertLevelOrder(arr, 2 * i + 2)
    }
    return root
}