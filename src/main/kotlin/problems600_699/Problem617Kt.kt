package problems600_699

object Problem617Kt {
    data class TreeNode internal constructor(internal var value: Int) {
        internal var left: TreeNode? = null
        internal var right: TreeNode? = null
    }

    fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
        val noLeft = t1 == null
        val noRight = t2 == null
        if (noLeft && noRight) {
            return null
        }
        if (noLeft) {
            return t2
        }
        if (noRight) {
            return t1
        }
        val result = TreeNode(t1!!.value + t2!!.value)
        result.left = mergeTrees(t1.left, t2.left)
        result.right = mergeTrees(t1.right, t2.right)
        return result
    }
}