package leetcode;

import org.junit.Test;

import static java.util.Arrays.asList;
import static leetcode.Asserts.assertEquivalent;

public class Problem18Test {
    private Problem18 solution = new Problem18();

    @Test
    public void simple() {
        assertEquivalent(solution.fourSum(new int[] {1, 0, -1, 0, -2, 2}, 0),
            asList(
                asList(-1, 0, 0, 1),
                asList(-2, -1, 1, 2),
                asList(-2, 0, 0, 2)));
    }

    @Test
    public void bigger() {
        assertEquivalent(solution.fourSum(new int[] {-3, -2, -1, 0, 0, 1, 2, 3}, 0),
            asList(
                asList(-3, -2, 2, 3),
                asList(-3, -1, 1, 3),
                asList(-3, 0, 0, 3),
                asList(-3, 0, 1, 2),
                asList(-2, -1, 0, 3),
                asList(-2, -1, 1, 2),
                asList(-2, 0, 0, 2),
                asList(-1, 0, 0, 1)));
    }
}
