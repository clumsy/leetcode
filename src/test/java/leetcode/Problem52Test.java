package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem52Test {
    private final Problem52 solution = new Problem52();
    
    @Test
    public void example1() {
        assertThat(solution.totalNQueens(4), is(2));
    }
    
    @Test
    public void example2() {
        assertThat(solution.totalNQueens(1), is(1));
    }
}
