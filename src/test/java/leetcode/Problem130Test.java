package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem130Test {
    private final Problem130 solution = new Problem130();

    @Test
    public void example1() {
        char[][] board = {
            {'X','X','X','X'},
            {'X','O','O','X'},
            {'X','X','O','X'},
            {'X','O','X','X'},
        };
        solution.solve(board);
        char[][] expected = {
            {'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'X', 'X'},
        };
        assert Arrays.deepEquals(board, expected);
    }

    @Test
    public void example2() {
        char[][] board = {
            {'X'},
        };
        solution.solve(board);
        char[][] expected = {
            {'X'},
        };
        assert Arrays.deepEquals(board, expected);
    }

    @Test
    public void example3() {
        char[][] board = {
            {'X','O','X','O','X','O'},
            {'O','X','O','X','O','X'},
            {'X','O','X','O','X','O'},
            {'O','X','O','X','O','X'},
        };
        solution.solve(board);
        char[][] expected = {
            {'X','O','X','O','X','O'},
            {'O','X','X','X','X','X'},
            {'X','X','X','X','X','O'},
            {'O','X','O','X','O','X'},
        };
        assert Arrays.deepEquals(board, expected);
    }
}
