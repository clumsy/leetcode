package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1470Test {
    private final Problem1470 solution = new Problem1470();
    
    @Test
    public void example1() {
        int[] nums = {2,5,1,3,4,7};
        assertThat(solution.shuffle(nums, 3), is(new int[] {2,3,5,4,1,7}));
    }
}
