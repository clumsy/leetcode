package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class Problem142Test {
    private final Problem142 solution = new Problem142();
    
    @Test
    public void example1() {
        ListNode list = ListNodes.list(3, 2, 0, -4);
        list.next.next.next.next = list.next;
        assertThat(solution.detectCycle(list).val, is(list.next.val));
    }
    
    @Test
    public void example2() {
        ListNode list = ListNodes.list(1,2);
        list.next.next = list;
        assertThat(solution.detectCycle(list).val, is(list.val));
    }
    
    @Test
    public void example3() {
        ListNode list = ListNodes.list(1);
        assertThat(solution.detectCycle(list), is(nullValue()));
    }
}
