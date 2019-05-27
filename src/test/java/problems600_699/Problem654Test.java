package problems600_699;

import org.junit.Test;
import problems600_699.Problem654.TreeNode;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static problems600_699.Problem654.constructMaximumBinaryTree;

public class Problem654Test {
    private static TreeNode treeOf(int x) {
        return treeOf(x, null, null);
    }

    private static TreeNode treeOf(int x, TreeNode left, TreeNode right) {
        TreeNode result = new TreeNode(x);
        result.left = left;
        result.right = right;
        return result;
    }

    @Test
    public void simple() {
        assertThat(constructMaximumBinaryTree(new int[] {3, 2, 1, 6, 0, 5}),
            is(treeOf(6,
                treeOf(3,
                    null,
                    treeOf(2,
                        null,
                        treeOf(1))),
                treeOf(5,
                    treeOf(0),
                    null))));
    }
}
