package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem38Test {
    private final Problem38 solution = new Problem38();

    @Test
    public void first() {
        assertThat(solution.countAndSay(1), is("1"));
    }

    @Test
    public void second() {
        assertThat(solution.countAndSay(2), is("11"));
    }

    @Test
    public void third() {
        assertThat(solution.countAndSay(3), is("21"));
    }

    @Test
    public void fourth() {
        assertThat(solution.countAndSay(4), is("1211"));
    }

    @Test
    public void fifth() {
        assertThat(solution.countAndSay(5), is("11121"));
    }

    @Test
    public void sixth() {
        assertThat(solution.countAndSay(6), is("312211"));
    }
}
