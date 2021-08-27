package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem188Test {
    private final Problem188 solution = new Problem188();
    
    @Test
    public void example1() {
        int[] prices = {2,4,1};
        assertThat(solution.maxProfit(2, prices), is(2));
    }
    
    @Test
    public void example2() {
        int[] prices = {3,2,6,5,0,3};
        assertThat(solution.maxProfit(2, prices), is(7));
    }
    
    @Test
    public void example3() {
        int[] prices = {2,6,8,7,8,7,9,4,1,2,4,5,8};
        assertThat(solution.maxProfit(3, prices), is(15));
    }
}
