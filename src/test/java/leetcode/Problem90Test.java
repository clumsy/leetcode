package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem90Test {
    private final Problem90 solution = new Problem90();

    @Test
    public void example1() {
        int[] nums = {1,2,2};
        assert Objects.equals(solution.subsetsWithDup(nums),
            Arrays.asList(
                Arrays.asList(),
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(1,2),
                Arrays.asList(2,2),
                Arrays.asList(1,2,2)));
    }
}
