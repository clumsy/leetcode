package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem129Test {
    private final Problem129 solution = new Problem129();

    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(1, 2, 3);
        assertThat(solution.sumNumbers(tree), is(25));
    }

    @Test
    public void example2() {
        TreeNode tree = TreeNodes.treeOf(4,9,0,5,1);
        assertThat(solution.sumNumbers(tree), is(1026));
    }
}
