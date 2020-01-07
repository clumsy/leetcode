package leetcode;

import org.junit.Test;

import static leetcode.ListNodes.list;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem23Test {
    protected Problem23 solution = new Problem23();

    public static class AlternativeTest extends Problem23Test {
        {
            this.solution = new Problem23.Alternative();
        }
    }

    public static class Alternative2Test extends Problem23Test {
        {
            this.solution = new Problem23.Alternative2();
        }
    }

    @Test
    public void simple() {
        assertThat(solution.mergeKLists(new ListNode[] {
            list(1, 4, 5),
            list(1, 3, 4),
            list(2, 6)
        }), is(list(1, 1, 2, 3, 4, 4, 5, 6)));
    }
}
