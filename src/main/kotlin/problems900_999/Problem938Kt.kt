package problems900_999

object Problem938Kt {
    data class TreeNode(val value: Int) {
        internal var left: TreeNode? = null
        internal var right: TreeNode? = null
    }

    fun treeOf(vararg values: Int?): TreeNode? {
        val length = values.size
        if (length == 0) {
            return null
        }
        val root = TreeNode(values[0]!!)
        for (i in 1 until length) {
            val value = values[i]
            if (value != null) {
                put(root, value)
            }
        }
        return root
    }

    private fun put(root: TreeNode, value: Int) {
        if (value < root.value) {
            if (root.left == null) {
                root.left = TreeNode(value)
            } else {
                put(root.left!!, value)
            }
        } else {
            if (root.right == null) {
                root.right = TreeNode(value)
            } else {
                put(root.right!!, value)
            }
        }
    }

    fun rangeSumBST(root: TreeNode, L: Int, R: Int): Int {
        var result = 0
        val leftCheck = root.value >= L
        if (leftCheck && root.left != null) {
            result += rangeSumBST(root.left!!, L, R)
        }
        if (root.value <= R) {
            if (root.right != null) {
                result += rangeSumBST(root.right!!, L, R)
            }
            if (leftCheck) {
                result += root.value
            }
        }
        return result
    }
}
