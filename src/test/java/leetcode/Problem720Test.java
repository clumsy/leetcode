package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem720Test {
    private final Problem720 solution = new Problem720();

    @Test
    public void example1() {
        assertThat(solution.longestWord(new String[] {"w","wo","wor","worl","world"}), is("world"));
    }
}
