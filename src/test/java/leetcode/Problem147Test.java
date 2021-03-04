package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem147Test {
    private final Problem147 solution = new Problem147();

    @Test
    public void example1() {
        ListNode list = ListNodes.list(4,2,1,3);
        assertThat(solution.insertionSortList(list), is(ListNodes.list(1,2,3,4)));
    }

    @Test
    public void example2() {
        ListNode list = ListNodes.list(-1,5,3,4,0);
        assertThat(solution.insertionSortList(list), is(ListNodes.list(-1,0,3,4,5)));
    }
}
