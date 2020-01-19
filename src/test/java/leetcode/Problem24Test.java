package leetcode;

import org.junit.Test;

import static leetcode.ListNodes.list;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem24Test {
    protected Problem24 solution = new Problem24();

    public static final class AlternativeTest extends Problem24Test {
        {
            this.solution = new Problem24.Alternative();
        }
    }

    @Test
    public void even() {
        assertThat(solution.swapPairs(list(1, 2, 3, 4)), is(list(2, 1, 4, 3)));
    }

    @Test
    public void odd() {
        assertThat(solution.swapPairs(list(1, 2, 3)), is(list(2, 1, 3)));
    }
}
