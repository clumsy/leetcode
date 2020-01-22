package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem48Test {
    private Problem48 solution = new Problem48();

    @Test
    public void simple() {
        int[][] input = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        solution.rotate(input);
        assertThat(input,
            is(new int[][] {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
            }));
    }

    @Test
    public void bigger() {
        int[][] input = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
        };
        solution.rotate(input);
        assertThat(input,
            is(new int[][] {
                {15, 13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7, 10, 11}
            }));
    }
}
