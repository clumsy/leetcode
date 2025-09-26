class Solution:
    def swapNodes(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        cur = head
        while cur is not None:
            k -= 1
            if k == 0:
                n1 = cur  # k-th node found
                n2 = head  # when cur is None this will point to n-k-th node
            elif k < 0:
                n2 = n2.next
            cur = cur.next
        n1.val, n2.val = n2.val, n1.val
        return head
