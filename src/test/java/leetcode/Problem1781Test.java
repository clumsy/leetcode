package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1781Test {
    private final Problem1781 solution = new Problem1781();
    
    @Test
    public void example1() {
        assertThat(solution.beautySum("aabcb"), is(5));
    }
    
    @Test
    public void example2() {
        assertThat(solution.beautySum("aabcbaa"), is(17));
    }
}
