import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class Problem2Test {

    @Test
    public void test() {
        Problem2.ListNode first = new Problem2.ListNode(2, new Problem2.ListNode(4, new Problem2.ListNode(3)));
        Problem2.ListNode second = new Problem2.ListNode(5, new Problem2.ListNode(6, new Problem2.ListNode(4)));
        assertThat(Problem2.addTwoNumbers(first, second),
            equalTo(new Problem2.ListNode(7, new Problem2.ListNode(0, new Problem2.ListNode(8)))));
    }
}
