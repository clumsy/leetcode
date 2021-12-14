package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem1313Test {
    private final Problem1313 solution = new Problem1313();
    
    @Test
    public void example1() {
        int[] nums = {1,2,3,4};
        assert Arrays.equals(solution.decompressRLElist(nums), new int[] {2,4,4,4});
    }
    
    @Test
    public void example2() {
        int[] nums = {1,1,2,3};
        assert Arrays.equals(solution.decompressRLElist(nums), new int[] {1,3,3});
    }
}
