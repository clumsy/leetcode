package leetcode;

import org.junit.Test;

import static java.util.Arrays.asList;
import static leetcode.Asserts.assertEquivalent;

public class Problem46Test {
    protected Problem46 solution = new Problem46();

    public static final class AlternativeTest extends Problem46Test {
        {
            this.solution = new Problem46.Alternative();
        }
    }

    @Test
    public void simple() {
        assertEquivalent(solution.permute(new int[] {1, 2, 3}),
            asList(
                asList(1, 2, 3),
                asList(1, 3, 2),
                asList(2, 1, 3),
                asList(2, 3, 1),
                asList(3, 1, 2),
                asList(3, 2, 1)));
    }
}
