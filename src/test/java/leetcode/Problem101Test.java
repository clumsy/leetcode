package leetcode;

import org.junit.Test;

import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem101Test {
    private Problem101 solution = new Problem101();

    @Test
    public void detectsSymmetric() {
        assertThat(solution.isSymmetric(treeOf(1, 2, 2, 3, 4, 4, 3)), is(true));
    }

    @Test
    public void detectsNotSymmetric() {
        assertThat(solution.isSymmetric(treeOf(1, 2, 2, null, 3, null, 3)), is(false));
    }
}
