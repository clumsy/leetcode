package problems600_699

import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat
import org.junit.Test
import problems600_699.Problem617Kt.TreeNode
import problems600_699.Problem617Kt.mergeTrees

class Problem617TestKt {
    private fun treeOf(x: Int, left: TreeNode? = null, right: TreeNode? = null): TreeNode {
        val result = TreeNode(x)
        result.left = left
        result.right = right
        return result
    }

    @Test
    fun simple() {
        assertThat(
            mergeTrees(
                treeOf(2,
                    treeOf(1,
                        null,
                        treeOf(4)),
                    treeOf(3,
                    null,
                        treeOf(7))),
                treeOf(1,
                    treeOf(3,
                        treeOf(5),
                        null),
                    treeOf(2))),
            `is`(
                treeOf(3,
                    treeOf(4,
                        treeOf(5),
                        treeOf(4)),
                    treeOf(5,
                        null,
                        treeOf(7)))))
    }
}