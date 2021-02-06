package leetcode;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Problem88Test {
    private final Problem88 solution = new Problem88();

    @Test
    public void example1() {
        int[] first = {1, 2, 3, 0, 0, 0};
        solution.merge(first, 3, new int[] {2,5,6}, 3);
        assertThat(first, is(new int[] {1,2,2,3,5,6}));
    }

    @Test
    public void example2() {
        int[] first = {1};
        solution.merge(first, 1, new int[] {}, 0);
        assertThat(first, is(new int[] {1}));
    }

    @Test
    public void example3() {
        int[] first = {4,5,6,0,0,0};
        solution.merge(first, 3, new int[] {1,2,3}, 3);
        assertThat(first, is(new int[] {1,2,3,4,5,6}));
    }
}