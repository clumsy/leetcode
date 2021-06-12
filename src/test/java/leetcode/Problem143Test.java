package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem143Test {
    private final Problem143 solution = new Problem143();
    
    @Test
    public void example1() {
        ListNode list = ListNodes.list(1,2,3,4);
        ListNode expected = ListNodes.list(1,4,2,3);
        solution.reorderList(list);
        assertThat(list, is(expected));
    }
    
    @Test
    public void example2() {
        ListNode list = ListNodes.list(1,2,3,4,5);
        ListNode expected = ListNodes.list(1,5,2,4,3);
        solution.reorderList(list);
        assertThat(list, is(expected));
    }
    
    @Test
    public void example3() {
        ListNode list = ListNodes.list(1);
        ListNode expected = ListNodes.list(1);
        solution.reorderList(list);
        assertThat(list, is(expected));
    }
}
