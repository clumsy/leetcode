package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1267Test {
    private final Problem1267 solution = new Problem1267();
    
    @Test
    public void example1() {
        assertThat(solution.countServers(new int[][] {{1,0},{0,1}}), is(0));
    }
    
    @Test
    public void example2() {
        assertThat(solution.countServers(new int[][] {{1,0},{1,1}}), is(3));
    }
    
    @Test
    public void example3() {
        assertThat(solution.countServers(new int[][] {{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}}), is(4));
    }
}
