package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem442Test {
    private final Problem442 solution = new Problem442();
    
    @Test
    public void example1() {
        int[] nums = {4,3,2,7,8,2,3,1};
        assert Objects.equals(solution.findDuplicates(nums),
            Arrays.asList(2,3));
    }
    
    @Test
    public void example2() {
        int[] nums = {1,1,2};
        assert Objects.equals(solution.findDuplicates(nums),
            Arrays.asList(1));
    }
    
    @Test
    public void example3() {
        int[] nums = {1};
        assert Objects.equals(solution.findDuplicates(nums),
            Arrays.asList());
    }
}
