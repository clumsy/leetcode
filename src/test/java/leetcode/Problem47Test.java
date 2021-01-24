package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem47Test {
    private final Problem47 solution = new Problem47();

    @Test
    public void example1() {
        int[] numbers = {1, 1, 2};
        assertThat(solution.permuteUnique(numbers),
            is(Arrays.asList(
                Arrays.asList(1, 1, 2),
                Arrays.asList(1, 2, 1),
                Arrays.asList(2, 1, 1)
            )));
    }

    @Test
    public void example2() {
        int[] numbers = {1, 2, 3};
        assertThat(solution.permuteUnique(numbers),
            is(Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3, 2),
                Arrays.asList(2, 1, 3),
                Arrays.asList(2, 3, 1),
                Arrays.asList(3, 1, 2),
                Arrays.asList(3, 2, 1)
            )));
    }
}
