package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem985Test {
    private final Problem985 solution = new Problem985();
    
    @Test
    public void example1() {
        int[] nums = {1, 2, 3, 4};
        int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        assertThat(solution.sumEvenAfterQueries(nums, queries), is(new int[] {8,6,2,4}));
    }
}
