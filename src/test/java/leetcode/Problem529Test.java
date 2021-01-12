package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem529Test {
    private final Problem529 solution = new Problem529();

    @Test
    public void example1() {
        char[][] board = new char[][] {
            {'E', 'E', 'E', 'E', 'E'},
            {'E', 'E', 'M', 'E', 'E'},
            {'E', 'E', 'E', 'E', 'E'},
            {'E', 'E', 'E', 'E', 'E'},
        };
        assertThat(solution.updateBoard(board, new int[] {3, 0}),
            is(new char[][] {
                {'B', '1', 'E', '1', 'B'},
                {'B', '1', 'M', '1', 'B'},
                {'B', '1', '1', '1', 'B'},
                {'B', 'B', 'B', 'B', 'B'},
            }));
    }

    @Test
    public void example2() {
        char[][] board = new char[][] {
            {'B', '1', 'E', '1', 'B'},
            {'B', '1', 'M', '1', 'B'},
            {'B', '1', '1', '1', 'B'},
            {'B', 'B', 'B', 'B', 'B'}
        };
        assertThat(solution.updateBoard(board, new int[] {1, 2}),
            is(new char[][] {
                {'B', '1', 'E', '1', 'B'},
                {'B', '1', 'X', '1', 'B'},
                {'B', '1', '1', '1', 'B'},
                {'B', 'B', 'B', 'B', 'B'}
            }));
    }
}
