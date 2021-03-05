package leetcode;

import static org.junit.Assert.assertThat;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class Problem78Test {
    private final Problem78 solution = new Problem78();

    @Test
    public void example1() {
        assertThat(solution.subsets(new int[] {1,2,3}),
            is(
                Arrays.asList(
                    Arrays.asList(),
                    Arrays.asList(1),
                    Arrays.asList(2),
                    Arrays.asList(1,2),
                    Arrays.asList(3),
                    Arrays.asList(1,3),
                    Arrays.asList(2,3),
                    Arrays.asList(1,2,3))));
    }

    @Test
    public void example2() {
        assertThat(solution.subsets(new int[] {0}),
            is(
                Arrays.asList(
                    Arrays.asList(),
                    Arrays.asList(0))));
    }
}
