package leetcode;

import org.junit.Test;

import static leetcode.Problem617.mergeTrees;
import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem617Test {

    @Test
    public void simple() {
        assertThat(mergeTrees(
            treeOf(2,
                treeOf(1,
                    null,
                    treeOf(4)),
                treeOf(3,
                    null,
                    treeOf(7))),
            treeOf(1,
                treeOf(3,
                    treeOf(5),
                    null),
                treeOf(2))),
            is(treeOf(3,
                treeOf(4,
                    treeOf(5),
                    treeOf(4)),
                treeOf(5,
                    null,
                    treeOf(7)))));
    }
}
