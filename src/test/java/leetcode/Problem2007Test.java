package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem2007Test {
    private final Problem2007 solution = new Problem2007();
    
    @Test
    public void example1() {
        int[] changed = {1,3,4,2,6,8};
        assert Arrays.equals(solution.findOriginalArray(changed), new int[]{1,3,4});
    }
    
    @Test
    public void example2() {
        int[] changed = {6,3,0,1};
        assert Arrays.equals(solution.findOriginalArray(changed), new int[0]);
    }
    
    @Test
    public void example3() {
        int[] changed = {1};
        assert Arrays.equals(solution.findOriginalArray(changed), new int[0]);
    }
    
    @Test
    public void example4() {
        int[] changed = {0,0,0,0};
        assert Arrays.equals(solution.findOriginalArray(changed), new int[] {0,0});
    }
}
