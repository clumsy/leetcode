package leetcode;

import org.junit.Test;

public class Problem2008Test {
    private final Problem2008 solution = new Problem2008();
    
    @Test
    public void example1() {
        int[][] rides = {{2,5,4},{1,5,1}};
        assert solution.maxTaxiEarnings(5, rides) == 7;
    }
    
    @Test
    public void example2() {
        int[][] rides = {{1,6,1},{3,10,2},{10,12,3},{11,12,2},{12,15,2},{13,18,1}};
        assert solution.maxTaxiEarnings(20, rides) == 20;
    }
}
