package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem557Test {
    private final Problem557 solution = new Problem557();

    @Test
    public void example1() {
        assertThat(solution.reverseWords("Let's take LeetCode contest"), is("s'teL ekat edoCteeL tsetnoc"));
    }

    @Test
    public void example2() {
        assertThat(solution.reverseWords("God Ding"), is("doG gniD"));
    }
}
