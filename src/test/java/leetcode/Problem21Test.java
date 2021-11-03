package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem21Test {
    private final Problem21 solution = new Problem21();

    @Test
    public void example1() {
        ListNode l1 = ListNodes.list(1,2,4);
        ListNode l2 = ListNodes.list(1,3,4);
        assert Objects.equals(solution.mergeTwoLists(l1, l2), ListNodes.list(1,1,2,3,4,4));
    }

    @Test
    public void example2() {
        ListNode l1 = ListNodes.list();
        ListNode l2 = ListNodes.list();
        assert Objects.equals(solution.mergeTwoLists(l1, l2), l1);
    }

    @Test
    public void example3() {
        ListNode l1 = ListNodes.list();
        ListNode l2 = ListNodes.list(0);
        assert Objects.equals(solution.mergeTwoLists(l1, l2), l2);
    }
}
