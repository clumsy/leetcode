package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem83Test {
    private final Problem83 solution = new Problem83();

    @Test
    public void example1() {
        ListNode list = ListNodes.list(1,1,2);
        assertThat(solution.deleteDuplicates(list), is(ListNodes.list(1,2)));
    }

    @Test
    public void example2() {
        ListNode list = ListNodes.list(1,1,2,3,3);
        assertThat(solution.deleteDuplicates(list), is(ListNodes.list(1,2,3)));
    }

    @Test
    public void example3() {
        ListNode list = ListNodes.list(1,1,1);
        assertThat(solution.deleteDuplicates(list), is(ListNodes.list(1)));
    }
}
