package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1929Test {
    private final Problem1929 solution = new Problem1929();
    
    @Test
    public void example1() {
        assertThat(solution.getConcatenation(new int[] {1,2,1}), is(new int[] {1,2,1,1,2,1}));
    }
    
    @Test
    public void example2() {
        assertThat(solution.getConcatenation(new int[] {1,3,2,1}), is(new int[] {1,3,2,1,1,3,2,1}));
    }
}
