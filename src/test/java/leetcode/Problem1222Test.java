package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem1222Test {
    private final Problem1222 solution = new Problem1222();
    
    @Test
    public void example1() {
        int[][] queens = {{0,1},{1,0},{4,0},{0,4},{3,3},{2,4}};
        int[] king = {0,0};
        assert Objects.equals(solution.queensAttacktheKing(queens, king),
            Arrays.asList(
                Arrays.asList(0,1),
                Arrays.asList(1,0),
                Arrays.asList(3,3)));
    }
    
    @Test
    public void example2() {
        int[][] queens = {{0,0},{1,1},{2,2},{3,4},{3,5},{4,4},{4,5}};
        int[] king = {3,3};
        assert Objects.equals(solution.queensAttacktheKing(queens, king),
            Arrays.asList(
                Arrays.asList(2,2),
                Arrays.asList(3,4),
                Arrays.asList(4,4)));
    }
    
    @Test
    public void example3() {
        int[][] queens = {
            {5,6},{7,7},{2,1},{0,7},{1,6},{5,1},{3,7},{0,3},{4,0},{1,2},{6,3},{5,0},{0,4},{2,2},{1,1},{6,4},{5,4},{0,0},
            {2,6},{4,5},{5,2},{1,4},{7,5},{2,3},{0,5},{4,2},{1,0},{2,7},{0,1},{4,6},{6,1},{0,6},{4,3},{1,7}
        };
        int[] king = {3,4};
        assert Objects.equals(solution.queensAttacktheKing(queens, king),
            Arrays.asList(
                Arrays.asList(2,3),
                Arrays.asList(1,4),
                Arrays.asList(1,6),
                Arrays.asList(3,7),
                Arrays.asList(4,3),
                Arrays.asList(5,4),
                Arrays.asList(4,5)));
    }
}
