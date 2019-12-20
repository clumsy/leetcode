package leetcode;

import leetcode.Problem2.ListNode;
import org.junit.Test;

import static leetcode.Problem2.addTwoNumbers;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class Problem2Test {

    @Test
    public void test() {
        ListNode first = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode second = new ListNode(5, new ListNode(6, new ListNode(4)));
        assertThat(addTwoNumbers(first, second),
            equalTo(new ListNode(7, new ListNode(0, new ListNode(8)))));
    }
}
