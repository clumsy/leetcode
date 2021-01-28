package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem85Test {
    private final Problem85 solution = new Problem85();

    @Test
    public void example1() {
        char[][] matrix = new char[][] {
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };
        assertThat(solution.maximalRectangle(matrix), is(6));
    }

    @Test
    public void example2() {
        assertThat(solution.maximalRectangle(new char[][] {}), is(0));
    }

    @Test
    public void example3() {
        assertThat(solution.maximalRectangle(new char[][] {{'0'}}), is(0));
    }

    @Test
    public void example4() {
        assertThat(solution.maximalRectangle(new char[][] {{'1'}}), is(1));
    }

    @Test
    public void example5() {
        assertThat(solution.maximalRectangle(new char[][] {{'0', '0'}}), is(0));
    }
}
