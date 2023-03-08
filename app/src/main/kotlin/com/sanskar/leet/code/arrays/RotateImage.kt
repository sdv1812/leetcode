package com.sanskar.leet.code.arrays

class RotateImage {
    fun rotate(matrix: Array<IntArray>): Unit {
        val matSize = matrix.size
        val r = matSize / 2
        for (i in 0 until r) {
            for (j in i until matSize - 1 - i) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[matSize - 1 - j][i]
                matrix[matSize - 1 - j][i] = matrix[matSize - 1 - i][matSize - 1 - j]
                matrix[matSize - 1 - i][matSize - 1 - j] = matrix[j][matSize - 1 - i]
                matrix[j][matSize - 1 - i] = temp
            }
        }
    }
}

fun printMat(mat: Array<IntArray>) {
    mat.forEach { ints ->
        ints.forEach {
            print("$it\t")
        }
        println()
    }
    printSeparator()
}

fun main() {
    val r = RotateImage()
    val mat =
        arrayOf(intArrayOf(5,1,9,11), intArrayOf(2,4,8,10), intArrayOf(13,3,6,7), intArrayOf(15,14,12,16))
    printMat(mat)
    r.rotate(mat)
    /*
    row 0
        col 0 (i =0, j = 0)
            0,0 -> 0, n-1
            0, n-1 -> n-1, n-1
            n-1, n-1 -> n-1, 0
            n-1, 0 -> 0,0

        col 1 (i = 0, j = 1)
            0,1 -> 1, n-1
            1, n-1 -> n-1, n-1-1
            n-1, n-1-1 -> n-1-1, 0
            n-1-1, 0 -> 0,1

        col j
            0,j -> j, n-1
            j, n-1 -> n-1, n-1-j
            n-1, n-1-j -> n-1-j, 0
            n-1-j -> 0,j

     row i, col j
            i,j -> j, n-1-i
            j, n-1-i -> n-1-i, n-1-j
            n-1-i, n-1-j -> n-1-j, i
            n-1-j, i ->
     */

}
