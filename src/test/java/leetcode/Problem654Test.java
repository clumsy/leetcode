package leetcode;

import org.junit.Test;

import static leetcode.Problem654.constructMaximumBinaryTree;
import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Problem654Test {

    @Test
    public void simple() {
        assertThat(constructMaximumBinaryTree(new int[] {3, 2, 1, 6, 0, 5}),
            is(treeOf(6,
                treeOf(3,
                    null,
                    treeOf(2,
                        null,
                        treeOf(1))),
                treeOf(5,
                    treeOf(0),
                    null))));
    }
}
