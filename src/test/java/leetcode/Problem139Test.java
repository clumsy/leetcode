package leetcode;

import static org.junit.Assert.assertThat;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class Problem139Test {
    private final Problem139 solution = new Problem139();

    @Test
    public void example1() {
        assertThat(solution.wordBreak("leetcode", Arrays.asList("leet", "code")), is(true));
    }

    @Test
    public void example2() {
        assertThat(solution.wordBreak("applepenapple", Arrays.asList("apple", "pen")), is(true));
    }

    @Test
    public void example3() {
        assertThat(solution.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")), is(false));
    }
}
