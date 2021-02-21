package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem58Test {
    private final Problem58 solution = new Problem58();

    @Test
    public void example1() {
        assertThat(solution.lengthOfLastWord("Hello World"), is(5));
    }

    @Test
    public void example2() {
        assertThat(solution.lengthOfLastWord(" "), is(0));
    }
}
