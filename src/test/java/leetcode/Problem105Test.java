package leetcode;

import org.junit.Test;

import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem105Test {
    private Problem105 solution = new Problem105();

    @Test
    public void simple() {
        assertThat(solution.buildTree(new int[] {3, 9, 20, 15, 7}, new int[] {9, 3, 15, 20, 7}),
            is(treeOf(3, 9, 20, null, null, 15, 7)));
    }
}
