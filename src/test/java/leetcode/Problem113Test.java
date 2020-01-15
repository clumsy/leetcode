package leetcode;

import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem113Test {
    private Problem113 solution = new Problem113();

    @Test
    public void simple() {
        assertThat(solution.pathSum(treeOf(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1), 22),
            is(asList(
                asList(5, 4, 11, 2),
                asList(5, 8, 4, 5))));
    }

    @Test
    public void negative() {
        assertThat(solution.pathSum(treeOf(-2, null, -3), -5),
            is(singletonList(
                asList(-2, -3))));
    }
}
