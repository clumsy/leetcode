package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1Test {
    private final Problem1 solution = new Problem1();

    @Test
    public void example1() {
        assertThat(solution.twoSum(new int[] {2, 7, 11, 15}, 9), is(new int[] {0, 1}));
    }
}
