package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem77Test {
    private final Problem77 solution = new Problem77();

    @Test
    public void example1() {
        assertThat(solution.combine(4, 2),
            is(
                Arrays.asList(
                    Arrays.asList(1, 2),
                    Arrays.asList(1, 3),
                    Arrays.asList(1, 4),
                    Arrays.asList(2, 3),
                    Arrays.asList(2, 4),
                    Arrays.asList(3, 4))));
    }

    @Test
    public void example2() {
        assertThat(solution.combine(1, 1),
            is(
                Arrays.asList(
                    Arrays.asList(1))));
    }
}
