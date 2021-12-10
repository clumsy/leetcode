package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem347Test {
    private final Problem347 solution = new Problem347();
    
    @Test
    public void example1() {
        int[] nums = {1,1,1,2,2,3};
        assert Arrays.equals(solution.topKFrequent(nums, 2),
            new int[] {1,2});
    }
    
    @Test
    public void example2() {
        int[] nums = {1};
        assert Arrays.equals(solution.topKFrequent(nums, 1),
            new int[] {1});
    }
}
