package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem189Test {
    private final Problem189 solution = new Problem189();
    
    @Test
    public void example1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        solution.rotate(nums, 3);
        assertThat(nums, is(new int[] {5,6,7,1,2,3,4}));
    }
    
    @Test
    public void example2() {
        int[] nums = {-1, -100, 3, 99};
        solution.rotate(nums, 2);
        assertThat(nums, is(new int[] {3,99,-1,-100}));
    }
    
    @Test
    public void example3() {
        int[] nums = {1,2,3,4,5,6};
        solution.rotate(nums, 2);
        assertThat(nums, is(new int[] {5,6,1,2,3,4}));
    }
    
    @Test
    public void example4() {
        int[] nums = {1};
        solution.rotate(nums, 2);
        assertThat(nums, is(new int[] {1}));
    }
    
    @Test
    public void example5() {
        int[] nums = {1,2};
        solution.rotate(nums, 0);
        assertThat(nums, is(new int[] {1, 2}));
    }
    
    @Test
    public void example6() {
        int[] nums = {1,2};
        solution.rotate(nums, 2);
        assertThat(nums, is(new int[] {1, 2}));
    }
}
