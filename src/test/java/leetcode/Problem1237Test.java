package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem1237Test {
    private final Problem1237 solution = new Problem1237();
    
    @Test
    public void example1() {
        assert Objects.equals(solution.findSolution(Integer::sum, 5),
            Arrays.asList(
                Arrays.asList(1,4),
                Arrays.asList(2,3),
                Arrays.asList(3,2),
                Arrays.asList(4,1)));
    }
    
    @Test
    public void example2() {
        assert Objects.equals(solution.findSolution((x,y) -> x*y, 5),
            Arrays.asList(
                Arrays.asList(1,5),
                Arrays.asList(5,1)));
    }
}
