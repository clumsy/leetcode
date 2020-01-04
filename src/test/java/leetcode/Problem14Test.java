package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem14Test {
    private Problem14 solution = new Problem14();

    @Test
    public void detectsFl() {
        assertThat(solution.longestCommonPrefix(new String[] {"flower", "flow", "flight"}), is("fl"));
    }

    @Test
    public void noPrefix() {
        assertThat(solution.longestCommonPrefix(new String[] {"dog", "racecar", "car"}), is(""));
    }

    @Test
    public void noPrefixForEmpty() {
        assertThat(solution.longestCommonPrefix(new String[0]), is(""));
    }
}
