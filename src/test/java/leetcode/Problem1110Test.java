package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1110Test {
    private final Problem1110 solution = new Problem1110();

    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(1,2,3,4,5,6,7);
        assertThat(solution.delNodes(tree, new int[] {3, 5}),
            is(Arrays.asList(
                TreeNodes.treeOf(1,2,null,4),
                TreeNodes.treeOf(6),
                TreeNodes.treeOf(7))));
    }
}
