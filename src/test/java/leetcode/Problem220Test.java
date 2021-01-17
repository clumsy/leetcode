package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem220Test {
    private final Problem220 solution = new Problem220();

    @Test
    public void example1() {
        assertThat(solution.containsNearbyAlmostDuplicate(new int[] {1, 2, 3, 1}, 3, 0), is(true));
    }

    @Test
    public void example2() {
        assertThat(solution.containsNearbyAlmostDuplicate(new int[] {1, 0, 1, 1}, 1, 2), is(true));
    }

    @Test
    public void example3() {
        assertThat(solution.containsNearbyAlmostDuplicate(new int[] {1, 5, 9, 1, 5, 9}, 2, 3), is(false));
    }

    @Test
    public void example4() {
        assertThat(solution.containsNearbyAlmostDuplicate(new int[] {-2147483648,2147483647}, 1, 0), is(false));
    }

    @Test
    public void example5() {
        assertThat(solution.containsNearbyAlmostDuplicate(new int[] {1, 2}, 0, 1), is(false));
    }
}
