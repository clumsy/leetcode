package leetcode;

import leetcode.Problem21.ListNode;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem21Test {
    private Problem21 solution = new Problem21();

    private static ListNode list(Integer... nodes) {
        ListNode root = new ListNode(nodes[0]);
        ListNode current = root;
        for (int i = 1; i < nodes.length; i++) {
            current.next = new ListNode(nodes[i]);
            current = current.next;
        }
        return root;
    }

    @Test
    public void simple() {
        assertThat(solution.mergeTwoLists(list(1, 2, 4), list(1, 3, 4)), is(list(1, 1, 2, 3, 4, 4)));
    }
}
