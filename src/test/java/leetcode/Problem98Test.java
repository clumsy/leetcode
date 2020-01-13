package leetcode;

import org.junit.Test;

import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem98Test {
    private Problem98 solution = new Problem98();

    @Test
    public void valid() {
        assertThat(solution.isValidBST(treeOf(2, 1, 3)), is(true));
    }

    @Test
    public void invalid() {
        assertThat(solution.isValidBST(treeOf(5, 1, 4, null, null, 3, 6)), is(false));
    }

    @Test
    public void invalidSameValue() {
        assertThat(solution.isValidBST(treeOf(1, 1, null)), is(false));
    }

    @Test
    public void complex() {
        assertThat(solution.isValidBST(treeOf(10, 5, 15, null, null, 6, 20)), is(false));
    }

    @Test
    public void empty() {
        assertThat(solution.isValidBST(null), is(true));
    }

    @Test
    public void weird() {
        assertThat(solution.isValidBST(treeOf(3, 1, 5, 0, 2, 4, 6)), is(true));
    }

    @Test
    public void max() {
        assertThat(solution.isValidBST(treeOf(Integer.MAX_VALUE)), is(true));
    }

    @Test
    public void huge() {
        assertThat(solution.isValidBST(treeOf(3, 1, 5, 0, 2, 4, 6, null, null, null, 3)), is(false));
    }

}
