package leetcode;

import org.junit.Test;

import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem979Test {
    private Problem979 solution = new Problem979();

    @Test
    public void first() {
        assertThat(solution.distributeCoins(treeOf(3, 0, 0)), is(2));
    }

    @Test
    public void second() {
        assertThat(solution.distributeCoins(treeOf(0, 3, 0)), is(3));
    }

    @Test
    public void third() {
        assertThat(solution.distributeCoins(treeOf(1, 0, 2)), is(2));
    }

    @Test
    public void fourth() {
        assertThat(solution.distributeCoins(treeOf(1, 0, 0, null, 3)), is(4));
    }
}
