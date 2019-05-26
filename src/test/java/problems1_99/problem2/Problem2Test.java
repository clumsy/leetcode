package problems1_99.problem2;

import org.junit.Test;
import problems1_99.problem2.Problem2.ListNode;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static problems1_99.problem2.Problem2.addTwoNumbers;

public class Problem2Test {

    @Test
    public void test() {
        ListNode first = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode second = new ListNode(5, new ListNode(6, new ListNode(4)));
        assertThat(addTwoNumbers(first, second),
            equalTo(new ListNode(7, new ListNode(0, new ListNode(8)))));
    }
}
