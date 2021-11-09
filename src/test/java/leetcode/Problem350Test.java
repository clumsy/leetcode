package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem350Test {
    private final Problem350 solution = new Problem350();
    
    @Test
    public void example1() {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        assert Arrays.equals(solution.intersect(nums1, nums2), new int[] {2,2}); 
    }
    
    @Test
    public void example2() {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        assert Arrays.equals(solution.intersect(nums1, nums2), new int[] {9,4}); 
    }
}
