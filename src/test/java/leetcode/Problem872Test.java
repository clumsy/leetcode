package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem872Test {
    private final Problem872 solution = new Problem872();

    @Test
    public void example1() {
        TreeNode tree1 = TreeNodes.treeOf(3,5,1,6,2,9,8,null,null,7,4);
        TreeNode tree2 = TreeNodes.treeOf(3,5,1,6,7,4,2,null,null,null,null,null,null,9,8);
        assertThat(solution.leafSimilar(tree1, tree2), is(true));
    }
}
