package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem39Test {
    protected final Problem39 solution = new Problem39();

    @Test
    public void example1() {
        int[] candidates = {2,3,6,7};
        assert Objects.equals(solution.combinationSum(candidates, 7),
            Arrays.asList(
                Arrays.asList(2,2,3),
                Arrays.asList(7)));
    }

    @Test
    public void example2() {
        int[] candidates = {2,3,5};
        assert Objects.equals(solution.combinationSum(candidates, 8),
            Arrays.asList(
                Arrays.asList(2,2,2,2),
                Arrays.asList(2,3,3),
                Arrays.asList(3,5)));
    }

    @Test
    public void example3() {
        int[] candidates = {4,2,7,5,6};
        assert Objects.equals(solution.combinationSum(candidates, 16),
            Arrays.asList(
                Arrays.asList(2,2,2,2,2,2,2,2),
                Arrays.asList(2,2,2,2,2,2,4),
                Arrays.asList(2,2,2,2,2,6),
                Arrays.asList(2,2,2,2,4,4),
                Arrays.asList(2,2,2,4,6),
                Arrays.asList(2,2,2,5,5),
                Arrays.asList(2,2,4,4,4),
                Arrays.asList(2,2,5,7),
                Arrays.asList(2,2,6,6),
                Arrays.asList(2,4,4,6),
                Arrays.asList(2,4,5,5),
                Arrays.asList(2,7,7),
                Arrays.asList(4,4,4,4),
                Arrays.asList(4,5,7),
                Arrays.asList(4,6,6),
                Arrays.asList(5,5,6)));
    }
}
