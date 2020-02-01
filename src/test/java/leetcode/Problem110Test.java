package leetcode;

import org.junit.Test;

import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem110Test {
    private Problem110 solution = new Problem110();

    @Test
    public void detectsBalanced() {
        assertThat(solution.isBalanced(treeOf(3, 9, 20, null, null, 15, 7)), is(true));
    }

    @Test
    public void detectsNotBalanced() {
        assertThat(solution.isBalanced(treeOf(1, 2, 2, 3, 3, null, null, 4, 4)), is(false));
    }
}
