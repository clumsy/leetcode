package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem513Test {
    private final Problem513 solution = new Problem513();

    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(2,1,3);
        assertThat(solution.findBottomLeftValue(tree), is(1));
    }

    @Test
    public void example2() {
        TreeNode tree = TreeNodes.treeOf(1,2,3,4,null,5,6,null,null,7);
        assertThat(solution.findBottomLeftValue(tree), is(7));
    }
}
