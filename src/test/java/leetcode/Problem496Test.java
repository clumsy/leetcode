package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem496Test {
    private final Problem496 solution = new Problem496();
    
    @Test
    public void example1() {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        assertThat(solution.nextGreaterElement(nums1, nums2), is(new int[] {-1,3,-1}));
    }
    
    @Test
    public void example2() {
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};
        assertThat(solution.nextGreaterElement(nums1, nums2), is(new int[] {3,-1}));
    }
}
