package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem993Test {
    private final Problem993 solution = new Problem993();

    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(1,2,3,4);
        assertThat(solution.isCousins(tree, 4, 3), is(false));
    }

    @Test
    public void example2() {
        TreeNode tree = TreeNodes.treeOf(1,2,3,null,4,null,5);
        assertThat(solution.isCousins(tree, 5, 4), is(true));
    }
}
