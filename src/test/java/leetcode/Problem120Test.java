package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Problem120Test {
    private final Problem120 solution = new Problem120();
    
    @Test
    public void example1() {
        List<List<Integer>> triangle =
            Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3,4),
                Arrays.asList(5,6,7),
                Arrays.asList(4,1,8,3));
        assert solution.minimumTotal(triangle) == 11;
    }
    
    @Test
    public void example2() {
        List<List<Integer>> triangle =
            Arrays.asList(
                Arrays.asList(-10));
        assert solution.minimumTotal(triangle) == -10;
    }
}
