package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem338Test {
    private final Problem338 solution = new Problem338();
    
    @Test
    public void example1() {
        assertThat(solution.countBits(2), is(new int[] {0,1,1}));
    }
    
    @Test
    public void example2() {
        assertThat(solution.countBits(5), is(new int[] {0,1,1,2,1,2}));
    }
}
