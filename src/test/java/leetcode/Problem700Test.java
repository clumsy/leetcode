package leetcode;

import org.junit.Test;

import static leetcode.Problem700.searchBST;
import static leetcode.Problem700.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem700Test {

    @Test
    public void simple() {
        assertThat(searchBST(treeOf(4, 2, 7, 1, 3), 2), is(treeOf(2, 1, 3)));
    }
}
