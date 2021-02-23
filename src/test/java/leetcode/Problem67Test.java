package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem67Test {
    private final Problem67 solution = new Problem67();

    @Test
    public void example1() {
        assertThat(solution.addBinary("11", "1"), is("100"));
    }

    @Test
    public void example2() {
        assertThat(solution.addBinary("1010", "1011"), is("10101"));
    }
}
