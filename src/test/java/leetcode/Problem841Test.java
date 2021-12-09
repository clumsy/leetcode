package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Problem841Test {
    private final Problem841 solution = new Problem841();
    
    @Test
    public void example1() {
        List<List<Integer>> rooms =
            Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(3),
                Arrays.asList());
        assert solution.canVisitAllRooms(rooms);
    }
    
    @Test
    public void example2() {
        List<List<Integer>> rooms =
            Arrays.asList(
                Arrays.asList(1,3),
                Arrays.asList(3,0,1),
                Arrays.asList(2),
                Arrays.asList(0));
        assert !solution.canVisitAllRooms(rooms);
    }
}
