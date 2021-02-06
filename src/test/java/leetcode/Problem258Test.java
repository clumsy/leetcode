package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem258Test {
    private final Problem258 solution = new Problem258();

    @Test
    public void example1() {
        assertThat(solution.addDigits(38), is(2));
    }
}
