package leetcode;

import org.junit.Test;

import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem112Test {
    private Problem112 solution = new Problem112();

    @Test
    public void simple() {
        assertThat(solution.hasPathSum(treeOf(5, 4, 8, 11, null, 13, 4, 7, 2, null, 1), 22), is(true));
    }
}
