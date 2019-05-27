package problems600_699

import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat
import org.junit.Test
import problems600_699.Problem654Kt.TreeNode
import problems600_699.Problem654Kt.constructMaximumBinaryTree

class Problem654TestKt {
    private fun treeOf(x: Int, left: TreeNode? = null, right: TreeNode? = null): TreeNode {
        val result = TreeNode(x)
        result.left = left
        result.right = right
        return result
    }

    @Test
    fun simple() {
        assertThat(
            constructMaximumBinaryTree(intArrayOf(3, 2, 1, 6, 0, 5)),
            `is`(
                treeOf(6,
                    treeOf(3,
                        right = treeOf(2,
                            right = treeOf(1))),
                    treeOf(5,
                        left = treeOf(0)))))
    }
}
