package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem15Test {
    private final Problem15 solution = new Problem15();

    @Test
    public void example1() {
        int[] nums = {-1,0,1,2,-1,-4};
        assert Objects.equals(solution.threeSum(nums), Arrays.asList(Arrays.asList(-1,-1,2), Arrays.asList(-1,0,1)));
    }

    @Test
    public void example2() {
        int[] nums = {0,0,0,0};
        assert Objects.equals(solution.threeSum(nums), Arrays.asList(Arrays.asList(0,0,0)));
    }
}
