package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem894Test {
    private final Problem894 solution = new Problem894();
    
    @Test
    public void example1() {
        assert Objects.equals(solution.allPossibleFBT(7),
            Arrays.asList(
                TreeNodes.treeOf(0,0,0,null,null,0,0,null,null,0,0),
                TreeNodes.treeOf(0,0,0,null,null,0,0,0,0),
                TreeNodes.treeOf(0,0,0,0,0,0,0),
                TreeNodes.treeOf(0,0,0,0,0,null,null,null,null,0,0),
                TreeNodes.treeOf(0,0,0,0,0,null,null,0,0)));
    }
    
    @Test
    public void example2() {
        assert Objects.equals(solution.allPossibleFBT(3),
            Arrays.asList(
                TreeNodes.treeOf(0,0,0)));
    }
}
