package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem77Test {
    private final Problem77 solution = new Problem77();

    @Test
    public void example1() {
        assert Objects.equals(solution.combine(4, 2),
            Arrays.asList(
                Arrays.asList(3,4),
                Arrays.asList(2,4),
                Arrays.asList(1,4),
                Arrays.asList(2,3),
                Arrays.asList(1,3),
                Arrays.asList(1,2)));
    }

    @Test
    public void example2() {
        assert Objects.equals(solution.combine(1, 1),
            Arrays.asList(
                Arrays.asList(1)));
    }
}
