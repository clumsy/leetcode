package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem206Test {
    private final Problem206 solution = new Problem206();

    @Test
    public void example1() {
        ListNode list = ListNodes.list(1,2,3,4,5);
        assertThat(solution.reverseList(list), is(ListNodes.list(5,4,3,2,1)));
    }
}
