package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem260Test {
    private final Problem260 solution = new Problem260();

    @Test
    public void example1() {
        assertThat(solution.singleNumber(new int[] {1,2,1,3,2,5}), is(new int[] {5,3}));
    }

    @Test
    public void example2() {
        assertThat(solution.singleNumber(new int[] {-1,0}), is(new int[] {0,-1}));
    }

    @Test
    public void example3() {
        assertThat(solution.singleNumber(new int[] {1,0}), is(new int[] {0, 1}));
    }
}
