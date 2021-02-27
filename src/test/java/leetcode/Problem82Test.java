package leetcode;

import static org.junit.Assert.assertThat;

import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class Problem82Test {
    private final Problem82 solution = new Problem82();

    @Test
    public void example1() {
        ListNode list = ListNodes.list(1,2,3,3,4,4,5);
        assertThat(solution.deleteDuplicates(list), is(ListNodes.list(1,2,5)));
    }

    @Test
    public void example2() {
        ListNode list = ListNodes.list(1,1,1,2,3);
        assertThat(solution.deleteDuplicates(list), is(ListNodes.list(2,3)));
    }
}
