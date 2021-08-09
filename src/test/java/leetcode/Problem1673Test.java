package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1673Test {
    private final Problem1673 solution = new Problem1673();
    
    @Test
    public void example1() {
        int[] nums = {3,5,2,6};
        int[] ans = {2,6};
        assertThat(solution.mostCompetitive(nums, 2), is(ans));
    }
    
    @Test
    public void example2() {
        int[] nums = {2,4,3,3,5,4,9,6};
        int[] ans = {2,3,3,4};
        assertThat(solution.mostCompetitive(nums, 4), is(ans));
    }
}
