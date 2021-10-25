package leetcode;

import org.junit.Test;

public class Problem1406Test {
    private final Problem1406 solution = new Problem1406();
    
    @Test
    public void example1() {
        int[] stoneValues = {1,2,3,7};
        assert solution.stoneGameIII(stoneValues).equals("Bob");
    }
    
    @Test
    public void example2() {
        int[] stoneValues = {1,2,3,-9};
        assert solution.stoneGameIII(stoneValues).equals("Alice");
    }
    
    @Test
    public void example3() {
        int[] stoneValues = {1,2,3,6};
        assert solution.stoneGameIII(stoneValues).equals("Tie");
    }
    
    @Test
    public void example4() {
        int[] stoneValues = {1,2,3,-1,-2,-3,7};
        assert solution.stoneGameIII(stoneValues).equals("Alice");
    }
    
    @Test
    public void example5() {
        int[] stoneValues = {-1,-2,-3};
        assert solution.stoneGameIII(stoneValues).equals("Tie");
    }
}
