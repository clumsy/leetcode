package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem1282Test {
    private final Problem1282 solution = new Problem1282();
    
    @Test
    public void example1() {
        int[] groupSizes = {3,3,3,3,3,1,3};
        assert Objects.equals(solution.groupThePeople(groupSizes),
            Arrays.asList(
                Arrays.asList(0,1,2),
                Arrays.asList(5),
                Arrays.asList(3,4,6)));
    }
    
    @Test
    public void example2() {
        int[] groupSizes = {2,1,3,3,3,2};
        assert Objects.equals(solution.groupThePeople(groupSizes),
            Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(2,3,4),
                Arrays.asList(0,5)));
    }
}
