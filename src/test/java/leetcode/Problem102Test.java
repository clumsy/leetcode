package leetcode;

import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem102Test {
    private Problem102 solution = new Problem102();

    @Test
    public void simple() {
        assertThat(solution.levelOrder(treeOf(3, 9, 20, null, null, 15, 7)),
            is(asList(
                singletonList(3),
                asList(9, 20),
                asList(15, 7))));
    }
}
