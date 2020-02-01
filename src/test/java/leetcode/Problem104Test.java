package leetcode;

import org.junit.Test;

import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem104Test {
    private Problem104 solution = new Problem104();

    @Test
    public void simple() {
        assertThat(solution.maxDepth(treeOf(3, 9, 20, null, null, 15, 7)), is(3));
    }
}
