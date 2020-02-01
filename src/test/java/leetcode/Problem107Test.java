package leetcode;

import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem107Test {
    private Problem107 solution = new Problem107();

    @Test
    public void simple() {
        assertThat(solution.levelOrderBottom(treeOf(3, 9, 20, null, null, 15, 7)),
            is(asList(
                asList(15, 7),
                asList(9, 20),
                singletonList(3))));
    }
}
