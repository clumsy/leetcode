package leetcode;

import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static leetcode.Asserts.assertEquivalent;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem40Test {
    protected Problem40 solution = new Problem40();

    public static final class AlternativeTest extends Problem40Test {
        {
            this.solution = new Problem40.Alternative();
        }
    }

    @Test
    public void simple() {
        assertEquivalent(solution.combinationSum2(new int[] {2, 5, 2, 1, 2}, 5),
            asList(
                singletonList(5),
                asList(1, 2, 2)));
    }

    @Test
    public void medium() {
        assertEquivalent(solution.combinationSum2(new int[] {3, 1, 3, 5, 1, 1}, 8),
            asList(
                asList(1, 1, 1, 5),
                asList(1, 1, 3, 3),
                asList(3, 5)));
    }

    @Test
    public void huge() {
        assertEquivalent(solution.combinationSum2(new int[] {10, 1, 2, 7, 6, 1, 5}, 8),
            asList(
                asList(1, 7),
                asList(1, 2, 5),
                asList(2, 6),
                asList(1, 1, 6)));
    }
}
