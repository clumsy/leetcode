package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem51Test {
    private final Problem51 solution = new Problem51();

    @Test
    public void example1() {
        assertThat(solution.solveNQueens(4),
            is(Arrays.asList(
                Arrays.asList(".Q..","...Q","Q...","..Q."),
                Arrays.asList("..Q.","Q...","...Q",".Q.."))));
    }

    @Test
    public void example2() {
        assertThat(solution.solveNQueens(1),
            is(Arrays.asList(
                Arrays.asList("Q"))));
    }
}
