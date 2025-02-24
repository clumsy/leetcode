class Solution:
    def doubleIt(self, head: Optional[ListNode]) -> Optional[ListNode]:
        cur = res = ListNode(0, next=head)
        while cur:
            cur.val = (2 * cur.val + (cur.next.val > 4 if cur.next else 0)) % 10
            cur = cur.next
        res = res if res.val else res.next
        return res

# class Solution:
#     def doubleIt(self, head: Optional[ListNode]) -> Optional[ListNode]:
#         cur = res = ListNode(0, next=head)
#         prv = None
#         while cur:
#             nxt, cur.next = cur.next, prv
#             prv, cur = cur, nxt
#         carry, cur, prv = 0, prv, None
#         while cur:
#             carry, cur.val = divmod(cur.val * 2 + carry, 10)
#             nxt, cur.next = cur.next, prv
#             prv, cur = cur, nxt
#         res = res if res.val else res.next
#         return res
