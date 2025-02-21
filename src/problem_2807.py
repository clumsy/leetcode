class Solution:
    def insertGreatestCommonDivisors(self, head: Optional[ListNode]) -> Optional[ListNode]:
        def gcd(a, b):
            return a if b == 0 else gcd(b, a % b)

        res = head
        while head and head.next:
            head.next = ListNode(val=gcd(head.val, head.next.val), next=head.next)
            head = head.next.next
        return res
