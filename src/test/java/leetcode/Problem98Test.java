package leetcode;

import org.junit.Test;

import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem98Test {
    private Problem98 solution = new Problem98();

    @Test
    public void valid() {
        assertThat(solution.isValidBST(
            treeOf(2,
                treeOf(1),
                treeOf(3))), is(true));
    }

    @Test
    public void invalid() {
        assertThat(solution.isValidBST(
            treeOf(5,
                treeOf(1),
                treeOf(4,
                    treeOf(3),
                    treeOf(6)))), is(false));
    }

    @Test
    public void invalidSameValue() {
        assertThat(solution.isValidBST(
            treeOf(1,
                treeOf(1),
                null)), is(false));
    }

    @Test
    public void complex() {
        assertThat(solution.isValidBST(
            treeOf(10,
                treeOf(5),
                treeOf(15,
                    treeOf(6),
                    treeOf(20)))), is(false));
    }

    @Test
    public void empty() {
        assertThat(solution.isValidBST(null), is(true));
    }

    @Test
    public void weird() {
        assertThat(solution.isValidBST(
            treeOf(3,
                treeOf(1,
                    treeOf(0),
                    treeOf(2)),
                treeOf(5,
                    treeOf(4),
                    treeOf(6)))), is(true));
    }

    @Test
    public void max() {
        assertThat(solution.isValidBST(treeOf(Integer.MAX_VALUE)), is(true));
    }

    @Test
    public void huge() {
        assertThat(solution.isValidBST(
            treeOf(3,
                treeOf(1,
                    treeOf(0),
                    treeOf(2,
                        null,
                        treeOf(3))),
                treeOf(5,
                    treeOf(4),
                    treeOf(6)))), is(false));
    }

}
