package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem219Test {
    private final Problem219 solution = new Problem219();

    @Test
    public void example1() {
        assertThat(solution.containsNearbyDuplicate(new int[] {1,2,3,1}, 3), is(true));
    }

    @Test
    public void example2() {
        assertThat(solution.containsNearbyDuplicate(new int[] {1,0,1,1}, 1), is(true));
    }

    @Test
    public void example3() {
        assertThat(solution.containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2), is(false));
    }
}
