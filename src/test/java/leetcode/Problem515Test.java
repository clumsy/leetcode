package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem515Test {
    private final Problem515 solution = new Problem515();

    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(1,3,2,5,3,null,9);
        assertThat(solution.largestValues(tree), is(Arrays.asList(1,3,9)));
    }
}
