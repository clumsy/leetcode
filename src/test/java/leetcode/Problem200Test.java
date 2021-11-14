package leetcode;

import org.junit.Test;

public class Problem200Test {
    private final Problem200 solution = new Problem200();

    @Test
    public void example1() {
        char[][] grid = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };
        assert solution.numIslands(grid) == 1;
    }

    @Test
    public void example2() {
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        assert solution.numIslands(grid) == 3;
    }
}
