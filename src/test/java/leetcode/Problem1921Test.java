package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1921Test {
    private final Problem1921 solution = new Problem1921();
    
    @Test
    public void example1() {
        int[] dist = {1,3,4};
        int[] speed = {1,1,1};
        assertThat(solution.eliminateMaximum(dist, speed), is(3));
    }
    
    @Test
    public void example2() {
        int[] dist = {1,1,2,3};
        int[] speed = {1,1,1,1};
        assertThat(solution.eliminateMaximum(dist, speed), is(1));
    }
    
    @Test
    public void example3() {
        int[] dist = {3,2,4};
        int[] speed = {5,3,2};
        assertThat(solution.eliminateMaximum(dist, speed), is(1));
    }
    
    @Test
    public void example4() {
        int[] dist = {3,5,7,4,5};
        int[] speed = {2,3,6,3,2};
        assertThat(solution.eliminateMaximum(dist, speed), is(2));
    }
}
