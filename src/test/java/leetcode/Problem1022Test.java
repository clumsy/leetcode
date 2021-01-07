package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1022Test {
    private final Problem1022 solution = new Problem1022();

    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(1,0,1,0,1,0,1);
        assertThat(solution.sumRootToLeaf(tree), is(22));
    }
}
