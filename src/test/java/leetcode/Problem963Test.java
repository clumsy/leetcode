package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem963Test {
    private final Problem963 solution = new Problem963();
    
    @Test
    public void example1() {
        int[][] points = {{1,2},{2,1},{1,0},{0,1}};
        assertThat(solution.minAreaFreeRect(points), is(2.));
    }
    
    @Test
    public void example5() {
        int[][] points = {{1,2},{1,3},{3,1},{3,2},{2,0},{0,3},{0,1},{3,3}};
        assertThat(solution.minAreaFreeRect(points), is(2.));
    }
}
