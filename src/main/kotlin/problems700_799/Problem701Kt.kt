package problems700_799

object Problem701Kt {
    data class TreeNode internal constructor(internal var value: Int) {
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

    fun insertIntoBST(root: TreeNode, value: Int): TreeNode {
        if (value > root.value) {
            if (root.right == null) {
                root.right = TreeNode(value)
            } else {
                insertIntoBST(root.right!!, value)
            }
        } else {
            if (root.left == null) {
                root.left = TreeNode(value)
            } else {
                insertIntoBST(root.left!!, value)
            }
        }
        return root
    }
}
