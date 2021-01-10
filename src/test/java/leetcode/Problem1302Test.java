package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1302Test {
    private final Problem1302 solution = new Problem1302();

    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(1,2,3,4,5,null,6,7,null,null,null,null,8);
        assertThat(solution.deepestLeavesSum(tree), is(15));
    }
}
