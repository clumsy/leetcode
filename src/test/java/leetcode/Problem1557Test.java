package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Problem1557Test {
    private final Problem1557 solution = new Problem1557();
    
    @Test
    public void example1() {
        List<List<Integer>> edges =
            Arrays.asList(
                Arrays.asList(0,1),
                Arrays.asList(0,2),
                Arrays.asList(2,5),
                Arrays.asList(3,4),
                Arrays.asList(4,2));
        assert Objects.equals(solution.findSmallestSetOfVertices(6, edges),
            Arrays.asList(0,3));
    }
    
    @Test
    public void example2() {
        List<List<Integer>> edges =
            Arrays.asList(
                Arrays.asList(0,1),
                Arrays.asList(2,1),
                Arrays.asList(3,1),
                Arrays.asList(1,4),
                Arrays.asList(2,4));
        assert Objects.equals(solution.findSmallestSetOfVertices(5, edges),
            Arrays.asList(0,2,3));
    }
}
