package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem57Test {
    private final Problem57 solution = new Problem57();

    @Test
    public void example1() {
        assertThat(solution.insert(new int[][] {{1,3},{6,9}}, new int[] {2,5}),
            is(new int[][] {{1,5},{6,9}}));
    }

    @Test
    public void example2() {
        assertThat(solution.insert(new int[][] {{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[] {4,8}),
            is(new int[][] {{1,2}, {3,10}, {12,16}}));
    }

    @Test
    public void example3() {
        assertThat(solution.insert(new int[0][0], new int[] {5,7}),
            is(new int[][] {{5,7}}));
    }

    @Test
    public void example4() {
        assertThat(solution.insert(new int[][] {{1,5}}, new int[] {2,7}),
            is(new int[][] {{1,7}}));
    }

    @Test
    public void example5() {
        assertThat(solution.insert(new int[][] {{1,5}}, new int[] {6,8}),
            is(new int[][] {{1,5},{6,8}}));
    }

    @Test
    public void example6() {
        assertThat(solution.insert(new int[][] {{2,4},{5,7},{8,10},{11,13}}, new int[] {3,6}),
            is(new int[][] {{2,7},{8,10},{11,13}}));
    }
}
