package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem257Test {
    private final Problem257 solution = new Problem257();

    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(1,2,3,null,5);
        assertThat(solution.binaryTreePaths(tree), is(Arrays.asList("1->2->5", "1->3")));
    }
}
