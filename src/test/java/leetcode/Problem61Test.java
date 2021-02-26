package leetcode;

import static org.junit.Assert.assertThat;

import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class Problem61Test {
    private final Problem61 solution = new Problem61();

    @Test
    public void example1() {
        ListNode list = ListNodes.list(1,2,3,4,5);
        assertThat(solution.rotateRight(list, 2), is(ListNodes.list(4,5,1,2,3)));
    }

    @Test
    public void example2() {
        ListNode list = ListNodes.list(0,1,2);
        assertThat(solution.rotateRight(list, 4), is(ListNodes.list(2,0,1)));
    }
}