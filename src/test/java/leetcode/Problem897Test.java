package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem897Test {
    private final Problem897 solution = new Problem897();

    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(5,3,6,2,4,null,8,1,null,null,null,7,9);
        TreeNode expected = TreeNodes.treeOf(1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9);
        assertThat(solution.increasingBST(tree), is(expected));
    }
}
