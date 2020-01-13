package leetcode;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1104Test {
    private Problem1104 solution = new Problem1104();

    @Test
    public void findsPathTo14() {
        assertThat(solution.pathInZigZagTree(14), is(asList(1, 3, 4, 14)));
    }

    @Test
    public void findsPathTo10() {
        assertThat(solution.pathInZigZagTree(10), is(asList(1, 2, 6, 10)));
    }

    @Test
    public void findsPathTo26() {
        assertThat(solution.pathInZigZagTree(26), is(asList(1, 2, 6, 10, 26)));
    }
}
