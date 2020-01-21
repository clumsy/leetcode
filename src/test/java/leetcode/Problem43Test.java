package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem43Test {
    private Problem43 solution = new Problem43();

    @Test
    public void zero() {
        assertThat(solution.multiply("9133", "0"), is("0"));
    }

    @Test
    public void simple() {
        assertThat(solution.multiply("2", "3"), is("6"));
    }

    @Test
    public void cary() {
        assertThat(solution.multiply("9", "9"), is("81"));
    }

    @Test
    public void complex() {
        assertThat(solution.multiply("123", "456"), is("56088"));
    }
}
