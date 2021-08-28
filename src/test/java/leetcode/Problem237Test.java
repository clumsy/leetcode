package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem237Test {
    private final Problem237 solution = new Problem237();
    
    @Test
    public void example1() {
        ListNode list = ListNodes.list(4,5,1,9);
        solution.deleteNode(list.next);
        assertThat(list, is(ListNodes.list(4,1,9)));
    }
    
    @Test
    public void example2() {
        ListNode list = ListNodes.list(4,5,1,9);
        solution.deleteNode(list.next.next);
        assertThat(list, is(ListNodes.list(4,5,9)));
    }
    
    @Test
    public void example3() {
        ListNode list = ListNodes.list(1,2,3,4);
        solution.deleteNode(list.next.next);
        assertThat(list, is(ListNodes.list(1,2,4)));
    }
    
    @Test
    public void example4() {
        ListNode list = ListNodes.list(0,1);
        solution.deleteNode(list);
        assertThat(list, is(ListNodes.list(1)));
    }
    
    @Test
    public void example5() {
        ListNode list = ListNodes.list(-3,5,-99);
        solution.deleteNode(list);
        assertThat(list, is(ListNodes.list(5,-99)));
    }
}
