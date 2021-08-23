package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem199Test {
    private final Problem199 solution = new Problem199();
    
    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(1,2,3,null,5,null,4);
        assertThat(solution.rightSideView(tree), is(Arrays.asList(1,3,4)));
    }
    
    @Test
    public void example2() {
        TreeNode tree = TreeNodes.treeOf(1,null,3);
        assertThat(solution.rightSideView(tree), is(Arrays.asList(1,3)));
    }
    
    @Test
    public void example3() {
        TreeNode tree = TreeNodes.treeOf();
        assertThat(solution.rightSideView(tree), is(Arrays.asList()));
    }
    
    @Test
    public void example4() {
        TreeNode tree = TreeNodes.treeOf(1,2,3,4);
        assertThat(solution.rightSideView(tree), is(Arrays.asList(1,3,4)));
    }
}
