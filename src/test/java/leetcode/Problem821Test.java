package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem821Test {
    private final Problem821 solution = new Problem821();
    
    @Test
    public void example1() {
        assertThat(solution.shortestToChar("loveleetcode", 'e'), is(new int[] {3,2,1,0,1,0,0,1,2,2,1,0}));
    }
    
    @Test
    public void example2() {
        assertThat(solution.shortestToChar("aaab", 'b'), is(new int[] {3,2,1,0}));
    }
}
