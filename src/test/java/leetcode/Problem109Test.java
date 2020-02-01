package leetcode;

import org.junit.Test;

import static leetcode.ListNodes.list;
import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem109Test {
    private Problem109 solution = new Problem109();

    @Test
    public void simple() {
        assertThat(solution.sortedListToBST(list(-10, -3, 0, 5, 9)), is(treeOf(0, -3, 9, -10, null, 5)));
    }
}
