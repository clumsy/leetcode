package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem1630Test {
    private final Problem1630 solution = new Problem1630();
    
    @Test
    public void example1() {
        int[] nums = {4,6,5,9,3,7};
        int[] l = {0,0,2};
        int[] r = {2,3,5};
        assert Objects.equals(solution.checkArithmeticSubarrays(nums, l, r),
            Arrays.asList(true,false,true));
    }
    
    @Test
    public void example2() {
        int[] nums = {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10};
        int[] l = {0,1,6,4,8,7};
        int[] r = {4,4,9,7,9,10};
        assert Objects.equals(solution.checkArithmeticSubarrays(nums, l, r),
            Arrays.asList(false,true,false,false,true,true));
    }
}
