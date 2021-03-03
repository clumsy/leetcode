package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem92Test {
    private final Problem92 solution = new Problem92();

    @Test
    public void example1() {
        ListNode list = ListNodes.list(1,2,3,4,5);
        assertThat(solution.reverseBetween(list, 2, 4), is(ListNodes.list(1,4,3,2,5)));
    }

    @Test
    public void example2() {
        ListNode list = ListNodes.list(5);
        assertThat(solution.reverseBetween(list, 1, 1), is(ListNodes.list(5)));
    }

    @Test
    public void example5() {
        ListNode list = ListNodes.list(3,5);
        assertThat(solution.reverseBetween(list, 1, 2), is(ListNodes.list(5,3)));
    }
}
