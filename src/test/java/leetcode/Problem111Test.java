package leetcode;

import org.junit.Test;

import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem111Test {
    private Problem111 solution = new Problem111();

    @Test
    public void simple() {
        assertThat(solution.minDepth(treeOf(3, 9, 20, null, null, 15, 7)), is(2));
    }
}
