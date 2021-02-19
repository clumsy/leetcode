package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem90Test {
    private final Problem90 solution = new Problem90();

    @Test
    public void example1() {
        assertThat(solution.subsetsWithDup(new int[] {1,2,2}),
            is(
                Arrays.asList(
                    Arrays.asList(),
                    Arrays.asList(1),
                    Arrays.asList(1,2),
                    Arrays.asList(1,2,2),
                    Arrays.asList(2),
                    Arrays.asList(2,2))));
    }
}
