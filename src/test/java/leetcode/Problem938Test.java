package leetcode;

import org.junit.Test;

import static leetcode.Problem938.rangeSumBST;
import static leetcode.Problem938.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem938Test {

    @Test
    public void withNull() {
        assertThat(rangeSumBST(treeOf(10, 5, 15, 3, 7, null, 18), 7, 15), is(32));
    }

    @Test
    public void withAnotherNull() {
        assertThat(rangeSumBST(treeOf(10, 5, 15, 3, 7, 13, 18, 1, null, 6), 6, 10), is(23));
    }
}
