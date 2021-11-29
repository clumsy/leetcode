package leetcode;

import org.junit.Test;

public class Problem149Test {
    private final Problem149 solution = new Problem149();
    
    @Test
    public void example1() {
        int[][] points = {
            {1,1},
            {2,2},
            {3,3},
        };
        assert solution.maxPoints(points) == 3;
    }
    
    @Test
    public void example2() {
        int[][] points = {
            {1,1},
            {3,2},
            {5,3},
            {4,1},
            {2,3},
            {1,4},
        };
        assert solution.maxPoints(points) == 4;
    }
    
    @Test
    public void example3() {
        int[][] points = {
            {1,1}
        };
        assert solution.maxPoints(points) == 1;
    }
    
    @Test
    public void example4() {
        int[][] points = {
            {4,5},
            {4,-1},
            {4,0},
        };
        assert solution.maxPoints(points) == 3;
    }
    
    @Test
    public void example5() {
        int[][] points = {
            {1,1},
            {3,2},
            {5,3},
            {4,1},
            {2,3},
            {1,4}
        };
        assert solution.maxPoints(points) == 4;
    }
}
