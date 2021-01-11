package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1026Test {
    private final Problem1026 solution = new Problem1026();

    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(8,3,10,1,6,null,14,null,null,4,7,13);
        assertThat(solution.maxAncestorDiff(tree), is(7));
    }

    @Test
    public void example2() {
        TreeNode tree = TreeNodes.treeOf(1,null,2,null,0,3);
        assertThat(solution.maxAncestorDiff(tree), is(3));
    }
}
