package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem518Test {
    private final Problem518 solution = new Problem518();
    
    @Test
    public void example1() {
        assertThat(solution.change(5, new int[] {1,2,5}), is(4));
    }
    
    @Test
    public void example2() {
        assertThat(solution.change(3, new int[] {2}), is(0));
    }
    
    @Test
    public void example3() {
        assertThat(solution.change(10, new int[] {10}), is(1));
    }
    
    @Test
    public void example4() {
        assertThat(solution.change(0, new int[] {}), is(1));
    }
    
    @Test
    public void example5() {
        assertThat(solution.change(7, new int[] {}), is(0));
    }
}
