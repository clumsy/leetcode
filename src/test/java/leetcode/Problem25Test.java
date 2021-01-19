package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem25Test {
    private final Problem25 solution = new Problem25();

    @Test
    public void example1() {
        ListNode list = ListNodes.list(1,2,3,4,5);
        assertThat(solution.reverseKGroup(list, 2), is(ListNodes.list(2,1,4,3,5)));
    }

    @Test
    public void example2() {
        ListNode list = ListNodes.list(1,2,3,4,5);
        assertThat(solution.reverseKGroup(list, 3), is(ListNodes.list(3,2,1,4,5)));
    }

    @Test
    public void example3() {
        ListNode list = ListNodes.list(1,2,3,4,5);
        assertThat(solution.reverseKGroup(list, 1), is(ListNodes.list(1,2,3,4,5)));
    }

    @Test
    public void example4() {
        ListNode list = ListNodes.list(1);
        assertThat(solution.reverseKGroup(list, 1), is(ListNodes.list(1)));
    }
}
