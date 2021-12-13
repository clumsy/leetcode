package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem1769Test {
    private final Problem1769 solution = new Problem1769();
    
    @Test
    public void example1() {
        assert Arrays.equals(solution.minOperations("110"), new int[] {1,1,3});
    }
    
    @Test
    public void example2() {
        assert Arrays.equals(solution.minOperations("001011"), new int[] {11,8,5,4,3,4});
    }
}
