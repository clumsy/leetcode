package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem863Test {
    private final Problem863 solution = new Problem863();
    
    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(3,5,1,6,2,0,8,null,null,7,4);
        assertThat(solution.distanceK(tree, tree.left, 2), is(Arrays.asList(1,7,4)));
    }
    
    @Test
    public void example2() {
        TreeNode tree = TreeNodes.treeOf(0,1,null,3,2);
        assertThat(solution.distanceK(tree, tree.left.right, 1), is(Arrays.asList(1)));
    }
    
    @Test
    public void example3() {
        TreeNode tree = TreeNodes.treeOf(0,1,3,null,2);
        assertThat(solution.distanceK(tree, tree.left, 2), is(Arrays.asList(3)));
    }
    
    @Test
    public void example4() {
        TreeNode tree = TreeNodes.treeOf(0,2,1,null,null,3);
        assertThat(solution.distanceK(tree, tree.right.left, 3), is(Arrays.asList(2)));
    }
    
    @Test
    public void example5() {
        TreeNode tree = TreeNodes.treeOf(1);
        assertThat(solution.distanceK(tree, tree, 3), is(Arrays.asList()));
    }
}
