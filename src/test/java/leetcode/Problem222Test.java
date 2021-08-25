package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem222Test {
    private final Problem222 solution = new Problem222();
    
    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(1,2,3,4,5,6);
        assertThat(solution.countNodes(tree), is(6));
    }
    
    @Test
    public void example2() {
        TreeNode tree = TreeNodes.treeOf();
        assertThat(solution.countNodes(tree), is(0));
    }
    
    @Test
    public void example3() {
        TreeNode tree = TreeNodes.treeOf(1);
        assertThat(solution.countNodes(tree), is(1));
    }
}
