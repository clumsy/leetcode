package leetcode;

import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static leetcode.Asserts.assertEquivalent;

public class Problem373Test {
    protected Problem373 solution = new Problem373();

    public static final class AlternativeTest extends Problem373Test {
        {
            this.solution = new Problem373.Alternative();
        }
    }

    @Test
    public void simple() {
        assertEquivalent(solution.kSmallestPairs(new int[] {1, 7, 11}, new int[] {2, 4, 6}, 3),
            asList(
                asList(1, 2),
                asList(1, 4),
                asList(1, 6)));
    }

    @Test
    public void empty() {
        assertEquivalent(solution.kSmallestPairs(new int[0], new int[0], 5), emptyList());
    }

    @Test
    public void firstIsEmpty() {
        assertEquivalent(solution.kSmallestPairs(new int[0], new int[] {3, 5, 7, 9}, 1), emptyList());
    }

    @Test
    public void similar() {
        assertEquivalent(solution.kSmallestPairs(new int[] {1, 1, 2}, new int[] {1, 2, 3}, 2),
            asList(
                asList(1, 1),
                asList(1, 1)));
    }

    @Test
    public void similarButSmaller() {
        assertEquivalent(solution.kSmallestPairs(new int[] {1, 1, 2}, new int[] {1, 2, 3}, 10),
            asList(
                asList(1, 1),
                asList(1, 1),
                asList(2, 1),
                asList(1, 2),
                asList(1, 2),
                asList(2, 2),
                asList(1, 3),
                asList(1, 3),
                asList(2, 3)));
    }
}
