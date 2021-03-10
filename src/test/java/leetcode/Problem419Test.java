package leetcode;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem419Test {
    private final Problem419 solution = new Problem419();

    @Test
    public void example1() {
        char[][] board = new char[][] {
            {'X','.','.','X'},
            {'.','.','.','X'},
            {'.','.','.','X'}
        };
        assertThat(solution.countBattleships(board), is(2));
    }
}
