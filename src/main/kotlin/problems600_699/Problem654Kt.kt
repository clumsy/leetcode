package problems600_699

object Problem654Kt {
    data class TreeNode internal constructor(internal var value: Int) {
        internal var left: TreeNode? = null
        internal var right: TreeNode? = null
    }

    fun constructMaximumBinaryTree(nums: IntArray): TreeNode {
        return constructMaximumBinaryTree(nums, 0, nums.size - 1)
    }

    private fun constructMaximumBinaryTree(nums: IntArray, left: Int, right: Int): TreeNode {
        if (right - left <= 0) {
            return TreeNode(nums[left])
        }
        var pos = left
        var max = nums[left]
        for (i in left + 1..right) {
            val cur = nums[i]
            if (max < cur) {
                max = cur
                pos = i
            }
        }
        val result = TreeNode(max)
        if (pos - left > 0) {
            result.left = constructMaximumBinaryTree(nums, left, pos - 1)
        }
        if (right - pos > 0) {
            result.right = constructMaximumBinaryTree(nums, pos + 1, right)
        }
        return result
    }
}
