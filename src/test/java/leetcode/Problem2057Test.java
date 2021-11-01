package leetcode;

import org.junit.Test;

public class Problem2057Test {
    private final Problem2057 solution = new Problem2057();
    
    @Test
    public void example1() {
        int[] nums = {0,1,2};
        assert solution.smallestEqual(nums) == 0;
    }
    
    @Test
    public void example2() {
        int[] nums = {4,3,2,1};
        assert solution.smallestEqual(nums) == 2;
    }
    
    @Test
    public void example3() {
        int[] nums = {1,2,3,4,5,6,7,8,9,0};
        assert solution.smallestEqual(nums) == -1;
    }
    
    @Test
    public void example4() {
        int[] nums = {2,1,3,5,2};
        assert solution.smallestEqual(nums) == 1;
    }
}
