package leetcode;

import leetcode.Problem123;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem123Test {
    private Problem123 solution = new Problem123();
    
    @Test
    public void example1() {
        assertThat(solution.maxProfit(new int[] {3,3,5,0,0,3,1,4}), is(6));
    }

    @Test
    public void example2() {
        assertThat(solution.maxProfit(new int[]{1, 2, 3, 4, 5}), is(4));
    }

    @Test
    public void example3() {
        assertThat(solution.maxProfit(new int[] {7,6,4,3,1}), is(0));
    }

    @Test
    public void example4() {
        assertThat(solution.maxProfit(new int[] {1}), is(0));
    }
}
