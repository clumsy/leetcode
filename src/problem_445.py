# class Solution:
#     def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
#         def reverse(lst):
#             prev, cur = None, lst
#             while cur is not None:
#                 nxt, cur.next, prev = cur.next, prev, cur
#                 cur = nxt
#             return prev
#         l1, l2 = reverse(l1), reverse(l2)
#         res, carry = l1, 0
#         while carry or l1 or l2:
#             carry, l1.val = divmod(l1.val + (l2.val if l2 else 0) + carry, 10)
#             if not l1.next and ((l2 and l2.next) or carry):
#                 l1.next = ListNode(0)
#             l1, l2 = l1.next, l2.next if l2 else None
#         res = reverse(res)
#         return res


class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        def to_stack(lst):
            s = []
            while lst:
                s.append(lst.val)
                lst = lst.next
            return s

        carry, s, l1, l2 = (0, [], to_stack(l1), to_stack(l2))
        while carry or l1 or l2:
            carry, val = divmod((l1.pop() if l1 else 0) + (l2.pop() if l2 else 0) + carry, 10)
            s.append(val)
        dummy = cur = ListNode()
        while s:
            cur.next = ListNode(s.pop())
            cur = cur.next
        res = dummy.next
        return res
