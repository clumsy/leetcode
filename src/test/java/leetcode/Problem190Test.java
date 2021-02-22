package leetcode;

import static org.junit.Assert.assertThat;

import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Problem190Test {
    private final Problem190 solution = new Problem190();

    @Test
    public void example1() {
        int n = Integer.parseInt("00000010100101000001111010011100", 2);
        assertThat(solution.reverseBits(n), is(964176192));
    }
}
