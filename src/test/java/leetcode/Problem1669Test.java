package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem1669Test {
    private final Problem1669 solution = new Problem1669();
    
    @Test
    public void example1() {
        ListNode list1 = ListNodes.list(0,1,2,3,4,5);
        ListNode list2 = ListNodes.list(1000000,1000001,1000002);
        assert Objects.equals(solution.mergeInBetween(list1, 3, 4, list2),
            ListNodes.list(0,1,2,1000000,1000001,1000002,5));
    }
    
    @Test
    public void example2() {
        ListNode list1 = ListNodes.list(0,1,2,3,4,5,6);
        ListNode list2 = ListNodes.list(1000000,1000001,1000002,1000003,1000004);
        assert Objects.equals(solution.mergeInBetween(list1, 2, 5, list2),
            ListNodes.list(0,1,1000000,1000001,1000002,1000003,1000004,6));
    }
}
