package leetcode;

import org.junit.Test;

import static leetcode.Problem617.mergeTrees;
import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem617Test {

    @Test
    public void simple() {
        assertThat(mergeTrees(treeOf(2, 1, 3, null, 4, null, 7), treeOf(1, 3, 2, 5, null)),
            is(treeOf(3, 4, 5, 5, 4, null, 7)));
    }
}
