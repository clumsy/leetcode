package leetcode;

import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static leetcode.Asserts.assertEquivalent;

public class Problem39Test {
    protected Problem39 solution = new Problem39();

    public static final class AlternativeTest extends Problem39Test {
        {
            this.solution = new Problem39.Alternative();
        }
    }

    @Test
    public void simple() {
        assertEquivalent(solution.combinationSum(new int[] {2, 3, 6, 7}, 7),
            asList(
                singletonList(7),
                asList(2, 2, 3)));
    }

    @Test
    public void repetitive() {
        assertEquivalent(solution.combinationSum(new int[] {2, 3, 5}, 8),
            asList(
                asList(2, 2, 2, 2),
                asList(2, 3, 3),
                asList(3, 5)));
    }

    @Test
    public void huge() {
        assertEquivalent(solution.combinationSum(new int[] {4, 2, 7, 5, 6}, 16), asList(
            asList(2, 2, 2, 2, 2, 2, 2, 2),
            asList(2, 2, 2, 2, 2, 2, 4),
            asList(2, 2, 2, 2, 2, 6),
            asList(2, 2, 2, 2, 4, 4),
            asList(2, 2, 2, 4, 6),
            asList(2, 2, 2, 5, 5),
            asList(2, 2, 4, 4, 4),
            asList(2, 2, 5, 7),
            asList(2, 2, 6, 6),
            asList(2, 4, 4, 6),
            asList(2, 4, 5, 5),
            asList(2, 7, 7),
            asList(4, 4, 4, 4),
            asList(4, 5, 7),
            asList(4, 6, 6),
            asList(5, 5, 6)));
    }
}
