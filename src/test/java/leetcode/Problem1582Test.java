package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1582Test {
    private final Problem1582 solution = new Problem1582();

    @Test
    public void example1() {
        int[][] mat = {
            {1,0,0},
            {0,0,1},
            {1,0,0}
        };
        assertThat(solution.numSpecial(mat), is(1));
    }

    @Test
    public void example2() {
        int[][] mat = {
            {1,0,0},
            {0,1,0},
            {0,0,1}
        };
        assertThat(solution.numSpecial(mat), is(3));
    }
    
    @Test
    public void example3() {
        int[][] mat = {
            {0,0,0,1},
            {1,0,0,0},
            {0,1,1,0},
            {0,0,0,0}
        };
        assertThat(solution.numSpecial(mat), is(2));
    }

    @Test
    public void example4() {
        int[][] mat = {
            {0,0,0,0,0},
            {1,0,0,0,0},
            {0,1,0,0,0},
            {0,0,1,0,0},
            {0,0,0,1,1}
        };
        assertThat(solution.numSpecial(mat), is(3));
    }
}
