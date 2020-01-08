package leetcode;

import org.junit.Test;

import static leetcode.Problem701.insertIntoBST;
import static leetcode.TreeNodes.bstOf;
import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem701Test {

    @Test
    public void simple() {
        assertThat(insertIntoBST(bstOf(4, 2, 7, 1, 3), 5), is(bstOf(4, 2, 7, 5, 1, 3)));
    }
}
