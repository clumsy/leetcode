package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1315Test {
    private final Problem1315 solution = new Problem1315();

    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(6,7,8,2,7,1,3,9,null,1,4,null,null,null,5);
        assertThat(solution.sumEvenGrandparent(tree), is(18));
    }
}
