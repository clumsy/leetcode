package leetcode;

import org.junit.Test;

import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem114Test {
    private Problem114 solution = new Problem114();

    @Test
    public void simple() {
        TreeNode source = treeOf(1, 2, 5, 3, 4, null, 6);
        solution.flatten(source);
        assertThat(source, is(treeOf(1, null, 2, null, 3, null, 4, null, 5, null, 6)));
    }
}
