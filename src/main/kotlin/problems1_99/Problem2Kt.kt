package problems1_99

object Problem2Kt {
    data class ListNode(val value: Int, var next: ListNode? = null)

    fun addTwoNumbers(l1: ListNode, l2: ListNode): ListNode {
        var carry = 0
        var value = l1.value + l2.value
        if (value > 9) {
            carry = value / 10
            value %= 10
        }
        val result = ListNode(value)
        var current = result
        var l1 = l1.next
        var l2 = l2.next
        while (l1 != null || l2 != null) {
            value = carry
            if (l1 != null) {
                value += l1.value
                l1 = l1.next
            }
            if (l2 != null) {
                value += l2.value
                l2 = l2.next
            }
            if (value > 9) {
                carry = value / 10
                value %= 10
            } else {
                carry = 0
            }
            val next = ListNode(value)
            current.next = next
            current = next
        }
        if (carry > 0) {
            current.next = ListNode(carry)
        }
        return result
    }
}