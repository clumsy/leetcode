package leetcode;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem54Test {
    private Problem54 solution = new Problem54();

    @Test
    public void threeByThree() {
        assertThat(solution.spiralOrder(new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        }), is(asList(1, 2, 3, 6, 9, 8, 7, 4, 5)));
    }

    @Test
    public void fourByFour() {
        assertThat(solution.spiralOrder(new int[][] {
            { 1,  2,  3,  4},
            { 5,  6,  7,  8},
            { 9, 10, 11, 12},
            {13, 14, 15, 16},
        }), is(asList(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10)));
    }

    @Test
    public void twoByTen() {
        assertThat(solution.spiralOrder(new int[][] {
            { 1, 11},
            { 2, 12},
            { 3, 13},
            { 4, 14},
            { 5, 15},
            { 6, 16},
            { 7, 17},
            { 8, 18},
            { 9, 19},
            {10, 20},
        }), is(asList(1, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 10, 9, 8, 7, 6, 5, 4, 3, 2)));
    }
}
