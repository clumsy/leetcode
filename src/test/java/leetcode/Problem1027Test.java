package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1027Test {
    private final Problem1027 solution = new Problem1027();
    
    @Test
    public void example1() {
        assertThat(solution.longestArithSeqLength(new int[] {3,6,9,12}), is(4));
    }
    
    @Test
    public void example2() {
        assertThat(solution.longestArithSeqLength(new int[] {9,4,7,2,10}), is(3));
    }
    
    @Test
    public void example3() {
        assertThat(solution.longestArithSeqLength(new int[] {20,1,15,3,10,5,8}), is(4));
    }
}
