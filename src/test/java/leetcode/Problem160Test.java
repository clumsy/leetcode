package leetcode;

import static org.junit.Assert.assertThat;

import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class Problem160Test {
    private final Problem160 solution = new Problem160();

    @Test
    public void example1() {
        ListNode common = ListNodes.list(8,4,5);
        ListNode first = ListNodes.list(4,1);
        first.next = common;
        ListNode second = ListNodes.list(5,6,1);
        second.next = common;
        assertThat(solution.getIntersectionNode(first, second), is(common));
    }
}