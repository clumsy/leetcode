package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem200Test {
    private final Problem200 solution = new Problem200();

    @Test
    public void example1() {
        char[][] grid = new char[][] {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };
        assertThat(solution.numIslands(grid), is(1));
    }
}
