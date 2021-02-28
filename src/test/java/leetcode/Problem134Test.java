package leetcode;

import static org.junit.Assert.assertThat;

import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class Problem134Test {
    private final Problem134 solution = new Problem134();

    @Test
    public void example1() {
        assertThat(solution.canCompleteCircuit(new int[] {1,2,3,4,5}, new int[] {3,4,5,1,2}), is(3));
    }

    @Test
    public void example2() {
        assertThat(solution.canCompleteCircuit(new int[] {2,3,4}, new int[] {3,4,3}), is(-1));
    }
}
