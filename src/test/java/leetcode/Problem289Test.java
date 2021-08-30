package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem289Test {
    private final Problem289 solution = new Problem289();
    
    @Test
    public void example1() {
        int[][] board = {
            {0,1,0},
            {0,0,1},
            {1,1,1},
            {0,0,0},
        };
        solution.gameOfLife(board);
        int[][] expected = {
            {0,0,0},
            {1,0,1},
            {0,1,1},
            {0,1,0},
        };
        assertThat(board, is(expected));
    }
    
    @Test
    public void example2() {
        int[][] board = {
            {1,1},
            {1,0},
        };
        solution.gameOfLife(board);
        int[][] expected = {
            {1,1},
            {1,1},
        };
        assertThat(board, is(expected));
    }
}
