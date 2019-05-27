package problems600_699;

import org.junit.Test;
import problems600_699.Problem617.TreeNode;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static problems600_699.Problem617.mergeTrees;

public class Problem617Test {
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
        assertThat(mergeTrees(
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
            is(treeOf(3,
                treeOf(4,
                    treeOf(5),
                    treeOf(4)),
                treeOf(5,
                    null,
                    treeOf(7)))));
    }
}
