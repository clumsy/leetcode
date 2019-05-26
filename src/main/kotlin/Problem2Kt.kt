class Problem2Kt {
    data class ListNode(val `val`: Int, var next: ListNode? = null)

    companion object {
        fun addTwoNumbers(list1: ListNode, list2: ListNode): ListNode {
            var carry = 0
            var value = list1.`val` + list2.`val`
            if (value > 9) {
                carry = value / 10
                value %= 10
            }
            val result = ListNode(value)
            var current = result
            var l1 = list1.next
            var l2 = list2.next
            while (l1 != null || l2 != null) {
                value = carry
                if (l1 != null) {
                    value += l1.`val`
                    l1 = l1.next
                }
                if (l2 != null) {
                    value += l2.`val`
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
}