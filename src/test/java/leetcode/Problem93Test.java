package leetcode;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem93Test {
    private Problem93 solution = new Problem93();

    @Test
    public void simple() {
        assertThat(solution.restoreIpAddresses("25525511135"),
            is(asList("255.255.11.135", "255.255.111.35")));
    }

    @Test
    public void zeroes() {
        assertThat(solution.restoreIpAddresses("010010"),
            is(asList("0.10.0.10", "0.100.1.0")));
    }
}
