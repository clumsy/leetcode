package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem988Test {
    private final Problem988 solution = new Problem988();
    
    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(0,1,2,3,4,3,4);
        assertThat(solution.smallestFromLeaf(tree), is("dba"));
    }
    
    @Test
    public void example2() {
        TreeNode tree = TreeNodes.treeOf(25,1,3,1,3,0,2);
        assertThat(solution.smallestFromLeaf(tree), is("adz"));
    }
    
    @Test
    public void example3() {
        TreeNode tree = TreeNodes.treeOf(2,2,1,null,1,0,null,0);
        assertThat(solution.smallestFromLeaf(tree), is("abc"));
    }
}
