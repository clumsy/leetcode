package leetcode;

import static org.junit.Assert.assertThat;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class Problem80Test {
    private final Problem80 solution = new Problem80();

    @Test
    public void example1() {
        int[] array = new int[] {1,1,1,2,2,3};
        assertThat(solution.removeDuplicates(array), is(5));
        assertThat(Arrays.equals(array, 0, 5, new int[] {1,1,2,2,3}, 0, 5), is(true));
    }

    @Test
    public void example2() {
        int[] array = new int[] {0,0,1,1,1,1,2,3,3};
        assertThat(solution.removeDuplicates(array), is(7));
        assertThat(Arrays.equals(array, 0, 7, new int[] {0,0,1,1,2,3,3}, 0, 7), is(true));
    }
}
