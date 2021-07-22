package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1227Test {
    private final Problem1227 solution = new Problem1227();
    
    @Test
    public void example1() {
        assertThat(solution.nthPersonGetsNthSeat(1), is(1.));
    }
    
    @Test
    public void example2() {
        assertThat(solution.nthPersonGetsNthSeat(2), is(0.5));
    }
    
    @Test
    public void example3() {
        assertThat(solution.nthPersonGetsNthSeat(3), is(0.5));
    }
}
