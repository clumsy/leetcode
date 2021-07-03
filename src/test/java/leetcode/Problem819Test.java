package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem819Test {
    private final Problem819 solution = new Problem819();
    
    @Test
    public void example1() {
        assertThat(solution.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",
            new String[] {"hit"}), is("ball"));
    }
}
