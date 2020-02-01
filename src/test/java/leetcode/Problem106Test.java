package leetcode;

import org.junit.Test;

import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem106Test {
    private Problem106 solution = new Problem106();

    @Test
    public void simple() {
        assertThat(solution.buildTree(new int[] {9, 3, 15, 20, 7}, new int[] {9,15,7,20,3}),
            is(treeOf(3, 9, 20, null, null, 15, 7)));
    }
}
