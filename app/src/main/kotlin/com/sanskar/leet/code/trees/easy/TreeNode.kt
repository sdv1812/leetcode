package com.sanskar.leet.code.trees.easy

data class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
    override fun toString(): String {
        return "val={${`val`}} left = {$left} right = {$right}"
    }
}


