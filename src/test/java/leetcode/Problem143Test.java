package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem143Test {
    private final Problem143 solution = new Problem143();
    
    @Test
    public void example1() {
        ListNode list = ListNodes.list(1,2,3,4);
        solution.reorderList(list);
        assert Objects.equals(list, ListNodes.list(1,4,2,3));
    }
    
    @Test
    public void example2() {
        ListNode list = ListNodes.list(1,2,3,4,5);
        solution.reorderList(list);
        assert Objects.equals(list, ListNodes.list(1,5,2,4,3));
    }
    
    @Test
    public void example3() {
        ListNode list = ListNodes.list(1);
        solution.reorderList(list);
        assert Objects.equals(list, ListNodes.list(1));
    }
}
