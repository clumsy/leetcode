package leetcode;

import org.junit.Test;

public class Problem997Test {
    private final Problem997 solution = new Problem997();
    
    @Test
    public void example1() {
        int[][] trust = {
            {1,2},
        };
        assert solution.findJudge(2, trust) == 2;
    }
    
    @Test
    public void example2() {
        int[][] trust = {
            {1,3},
            {2,3},
        };
        assert solution.findJudge(3, trust) == 3;
    }
    
    @Test
    public void example3() {
        int[][] trust = {
            {1,3},
            {2,3},
            {3,1},
        };
        assert solution.findJudge(3, trust) == -1;
    }
    
    @Test
    public void example4() {
        int[][] trust = {
            {1,2},
            {2,3},
        };
        assert solution.findJudge(3, trust) == -1;
    }
    
    @Test
    public void example5() {
        int[][] trust = {
            {1,3},
            {1,4},
            {2,3},
            {2,4},
            {4,3},
        };
        assert solution.findJudge(4, trust) == 3;
    }
}
