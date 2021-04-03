package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem714Test {
    private final Problem714 solution = new Problem714();
    
    @Test
    public void example1() {
        assertThat(solution.maxProfit(new int[] {1,3,2,8,4,9}, 2), is(8));
    }
    
    @Test
    public void example2() {
        assertThat(solution.maxProfit(new int[] {1,3,7,5,10,3}, 3), is(6));
    }
}
