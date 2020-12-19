package problems1_99

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`
import org.junit.Test
import problems1_99.Problem141Kt.ListNode

internal class Problem141TestKt {

    @Test
    fun `Detects when starting from the cycle`() {
        val head = ListNode(3)
        var list = head
        list.next = ListNode(2)
        list = list.next!!
        list.next = ListNode(0)
        list = list.next!!
        list.next = ListNode(-4)
        list = list.next!!
        list.next = head.next
        assertThat(Problem141Kt.hasCycle(head), `is`(true))
    }

    @Test
    fun `Singleton list has no cycle`() {
        val list = ListNode(1)
        assertThat(Problem141Kt.hasCycle(list), `is`(false))
    }
}
