package leetcode;

import org.junit.Test;

public class Problem1732Test {
    private final Problem1732 solution = new Problem1732();
    
    @Test
    public void example1() {
        int[] gain = {-5,1,5,0,-7};
        assert solution.largestAltitude(gain) == 1;
    }
    
    @Test
    public void example2() {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        assert solution.largestAltitude(gain) == 0;
    }
}
