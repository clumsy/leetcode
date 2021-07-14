package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem753Test {
    private final Problem753 solution = new Problem753();
    
    @Test
    public void example1() {
        assertThat(solution.crackSafe(1, 2), is("10"));
    }
    
    @Test
    public void example2() {
        assertThat(solution.crackSafe(2, 2), is("01100"));
    }
}
