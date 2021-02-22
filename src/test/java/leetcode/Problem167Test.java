package leetcode;

import static org.junit.Assert.assertThat;

import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class Problem167Test {
    private final Problem167 solution = new Problem167();

    @Test
    public void example1() {
        assertThat(solution.twoSum(new int[] {2,7,11,15}, 9), is(new int[] {1,2}));
    }
}
