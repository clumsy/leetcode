package leetcode;

import static org.junit.Assert.assertThat;

import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class Problem191Test {
    private final Problem191 solution = new Problem191();

    @Test
    public void example1() {
        int n = Integer.parseInt("00000000000000000000000000001011", 2);
        assertThat(solution.hammingWeight(n), is(3));
    }
}
