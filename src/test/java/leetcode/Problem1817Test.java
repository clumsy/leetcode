package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem1817Test {
    private final Problem1817 solution = new Problem1817();
    
    @Test
    public void example1() {
        int[][] logs = {{0,5},{1,2},{0,2},{0,5},{1,3}};
        assert Arrays.equals(solution.findingUsersActiveMinutes(logs, 5),
            new int[] {0,2,0,0,0});
    }
    
    @Test
    public void example2() {
        int[][] logs = {{1,1},{2,2},{2,3}};
        assert Arrays.equals(solution.findingUsersActiveMinutes(logs, 4),
            new int[] {1,1,0,0});
    }
}
