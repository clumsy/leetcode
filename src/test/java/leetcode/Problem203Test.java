package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem203Test {
    private final Problem203 solution = new Problem203();

    @Test
    public void example1() {
        ListNode list = ListNodes.list(1,2,6,3,4,5,6);
        assertThat(solution.removeElements(list, 6), is(ListNodes.list(1,2,3,4,5)));
    }
}
