import marimo

__generated_with = "0.3.12"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2074](https://leetcode.com/problems/reverse-nodes-in-even-length-groups)")
    return


@app.cell
def __():
    # Definition for singly-linked list.
    class ListNode:
        def __init__(self, val=0, next=None):
            self.val = val
            self.next = next

        def __eq__(self, other):
            return other and self.val == other.val and self.next == other.next
    return ListNode,


@app.cell
def __():
    from typing import Optional
    return Optional,


@app.cell
def __(ListNode, Optional):
    class Solution:
        def reverseEvenLengthGroups(self, head: Optional[ListNode]) -> Optional[ListNode]:
            p, k, start = 42, 1, ListNode(next=head)
            while start:
                p, end = 0, start
                while p < k and end:
                    p += end.next is not None
                    end = end.next
                if p & 1 == 0:
                    prv, cur = end.next if end else None, start.next
                    while p:
                        nxt = cur.next if cur else None
                        if cur:
                            cur.next = prv
                        cur, prv = nxt, cur
                        p -= 1
                    start.next, start = prv, start.next
                else:
                    start = end
                k += 1
            res = head
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(ListNode):
    def as_list(vals):
        head = cur = ListNode()
        for i in vals:
            cur.next = ListNode(i)
            cur = cur.next
        return head.next
    return as_list,


@app.cell
def __(as_list, sol):
    assert sol.reverseEvenLengthGroups(as_list([5,2,6,3,9,1,7,3,8,4])) == as_list([5,6,2,3,9,1,4,8,3,7])
    return


@app.cell
def __(as_list, sol):
    assert sol.reverseEvenLengthGroups(as_list([1,1,0,6])) == as_list([1,0,1,6])
    return


@app.cell
def __(as_list, sol):
    assert sol.reverseEvenLengthGroups(as_list([1,1,0,6,5])) == as_list([1,0,1,5,6])
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
