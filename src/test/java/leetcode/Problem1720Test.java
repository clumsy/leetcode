package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1720Test {
    private final Problem1720 solution = new Problem1720();
    
    @Test
    public void example1() {
        assertThat(solution.decode(new int[] {1,2,3}, 1), is(new int[] {1,0,2,1}));
    }
    
    @Test
    public void example2() {
        assertThat(solution.decode(new int[] {6,2,7,3}, 4), is(new int[] {4,2,0,7,4}));
    }
}
