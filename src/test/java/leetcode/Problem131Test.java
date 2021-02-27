package leetcode;

import static org.junit.Assert.assertThat;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class Problem131Test {
    private final Problem131 solution = new Problem131();

    @Test
    public void example1() {
        assertThat(solution.partition("aab"),
            is(Arrays.asList(
                Arrays.asList("a", "a", "b"),
                Arrays.asList("aa", "b"))));
    }

    @Test
    public void example2() {
        assertThat(solution.partition("a"),
            is(Arrays.asList(
                Arrays.asList("a"))));
    }
}
