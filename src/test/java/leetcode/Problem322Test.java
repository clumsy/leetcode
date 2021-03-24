package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem322Test {
    private final Problem322 solution = new Problem322();
    
    @Test
    public void example1() {
        assertThat(solution.coinChange(new int[] {1,2,5}, 11), is(3));
    }
    
    @Test
    public void example2() {
        assertThat(solution.coinChange(new int[] {2}, 3), is(-1));
    }
}
