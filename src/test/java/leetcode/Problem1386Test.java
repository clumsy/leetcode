package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1386Test {
    private final Problem1386 solution = new Problem1386();
    
    @Test
    public void example1() {
        int[][] reservedSeats = {{1,2},{1,3},{1,8},{2,6},{3,1},{3,10}};
        assertThat(solution.maxNumberOfFamilies(3, reservedSeats), is(4));
    }
    
    @Test
    public void example2() {
        int[][] reservedSeats = {{2,1},{1,8},{2,6}};
        assertThat(solution.maxNumberOfFamilies(2, reservedSeats), is(2));
    }
    
    @Test
    public void example3() {
        int[][] reservedSeats = {{4,3},{1,4},{4,6},{1,7}};
        assertThat(solution.maxNumberOfFamilies(4, reservedSeats), is(4));
    }
}
