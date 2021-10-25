package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class Problem2032Test {
    private final Problem2032 solution = new Problem2032();
    
    @Test
    public void example1() {
        int[] nums1 = {1,1,3,2};
        int[] nums2 = {2,3};
        int[] nums3 = {3};
        assert solution.twoOutOfThree(nums1, nums2, nums3).equals(Arrays.asList(2,3));
    }
    
    @Test
    public void example2() {
        int[] nums1 = {3,1};
        int[] nums2 = {2,3};
        int[] nums3 = {1,2};
        assert solution.twoOutOfThree(nums1, nums2, nums3).equals(Arrays.asList(1,2,3));
    }
    
    @Test
    public void example3() {
        int[] nums1 = {1,2,2};
        int[] nums2 = {4,3};
        int[] nums3 = {5};
        assert solution.twoOutOfThree(nums1, nums2, nums3).equals(Collections.emptyList());
    }
}
