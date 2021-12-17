package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem2089Test {
    private final Problem2089 solution = new Problem2089();
    
    @Test
    public void example1() {
        int[] nums = {1,2,5,2,3};
        assert Objects.equals(solution.targetIndices(nums, 2),
            Arrays.asList(1,2));
    }
    
    @Test
    public void example2() {
        int[] nums = {1,2,5,2,3};
        assert Objects.equals(solution.targetIndices(nums, 3),
            Arrays.asList(3));
    }
}
