package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem492Test {
    private final Problem492 solution = new Problem492();
    
    @Test
    public void example1() {
        assertThat(solution.constructRectangle(4), is(new int[] {2,2}));
    }
    
    @Test
    public void example2() {
        assertThat(solution.constructRectangle(37), is(new int[] {37,1}));
    }
    
    @Test
    public void example3() {
        assertThat(solution.constructRectangle(122122), is(new int[] {427,286}));
    }
}
