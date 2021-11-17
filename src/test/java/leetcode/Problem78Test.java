package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem78Test {
    private final Problem78 solution = new Problem78();

    @Test
    public void example1() {
        int[] nums = {1,2,3};
        assert Objects.equals(solution.subsets(nums),
            Arrays.asList(
                Arrays.asList(),
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(1,2),
                Arrays.asList(3),
                Arrays.asList(1,3),
                Arrays.asList(2,3),
                Arrays.asList(1,2,3)));
    }

    @Test
    public void example2() {
        int[] nums = {0};
        assert Objects.equals(solution.subsets(nums),
            Arrays.asList(
                Arrays.asList(),
                Arrays.asList(0)));
    }
}
