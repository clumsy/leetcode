package leetcode;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem563Test {
    private final Problem563 solution = new Problem563();

    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(1,2,3);
        assertThat(solution.findTilt(tree), is(1));
    }

    @Test
    public void example2() {
        TreeNode tree = TreeNodes.treeOf(4,2,9,3,5,null,7);
        assertThat(solution.findTilt(tree), is(15));
    }
}
