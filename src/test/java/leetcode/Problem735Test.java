package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem735Test {
    private final Problem735 solution = new Problem735();
    
    @Test
    public void example1() {
        int[] asteroids = {};
        assertThat(solution.asteroidCollision(asteroids), is(new int[] {5,10,-5}));
    }
    
    @Test
    public void example2() {
        int[] asteroids = {8,-8};
        assertThat(solution.asteroidCollision(asteroids), is(new int[0]));
    }
    
    @Test
    public void example3() {
        int[] asteroids = {10,2,-5};
        assertThat(solution.asteroidCollision(asteroids), is(new int[] {10}));
    }
    
    @Test
    public void example4() {
        int[] asteroids = {-2,-1,1,2};
        assertThat(solution.asteroidCollision(asteroids), is(new int[] {-2,-1,1,2}));
    }
}
