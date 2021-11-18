package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem40Test {
    private final Problem40 solution = new Problem40();

    @Test
    public void example1() {
        int[] candidates = {2,5,2,1,2};
        assert Objects.equals(solution.combinationSum2(candidates, 5),
            Arrays.asList(
                Arrays.asList(1, 2, 2),
                Arrays.asList(5)));
    }

    @Test
    public void example2() {
        int[] candidates = {3,1,3,5,1,1};
        assert Objects.equals(solution.combinationSum2(candidates, 8),
            Arrays.asList(
                Arrays.asList(1,1,1,5),
                Arrays.asList(1,1,3,3),
                Arrays.asList(3,5)));
    }

    @Test
    public void example3() {
        int[] candidates = {10,1,2,7,6,1,5};
        assert Objects.equals(solution.combinationSum2(candidates, 8),
            Arrays.asList(
                Arrays.asList(1,1,6),
                Arrays.asList(1,2,5),
                Arrays.asList(1,7),
                Arrays.asList(2,6)));
    }
}
