package problem2

import org.hamcrest.core.IsEqual.equalTo
import org.junit.Assert.assertThat
import org.junit.Test
import problem2.Problem2Kt.Companion.addTwoNumbers
import problem2.Problem2Kt.ListNode

class Problem2TestKt {

    @Test
    fun `(2 ~ 4 ~ 3) + (5 ~ 6 ~ 4) = (7 ~ 0 ~ 8)`() {
        val first = ListNode(2, ListNode(4, ListNode(3)))
        val second = ListNode(5, ListNode(6, ListNode(4)))
        assertThat(addTwoNumbers(first, second), equalTo(ListNode(7, ListNode(0, ListNode(8)))))
    }
}