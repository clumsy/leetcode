package problems700_799

object Problem700Kt {
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

    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        if (root == null) {
            return null
        }
        val result = `val` - root.value
        if (result == 0) {
            return root
        }
        return if (result < 0) {
            searchBST(root.left, `val`)
        } else {
            searchBST(root.right, `val`)
        }
    }
}
