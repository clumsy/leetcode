class Solution:
    def splitListToParts(self, head: Optional[ListNode], k: int) -> List[Optional[ListNode]]:
        n, cur = 0, head
        while cur:
            n += 1
            cur = cur.next
        d, r = divmod(n, k)
        res = []
        for _ in range(k):
            cur = dummy = ListNode()
            for _ in range(d + (r > 0)):
                dummy.next, head, dummy = head, head.next, head
            r = max(0, r - 1)
            dummy.next = None
            res.append(cur.next)
        return res
