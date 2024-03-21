import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2487](https://leetcode.com/problems/remove-nodes-from-linked-list)")
    return


@app.cell
def __():
    # Definition for singly-linked list.
    class ListNode:
        def __init__(self, val=0, next=None):
            self.val = val
            self.next = next

        def __eq__(self, other):
            return self.val == other.val and self.next == other.next
    return ListNode,


@app.cell
def __():
    from typing import Optional
    from collections import deque
    return Optional, deque


@app.cell
def __(ListNode, Optional, deque):
    class Solution:
        def removeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
            stack = deque()
            while head:
                while stack and stack[-1].val < head.val:
                    stack.pop()
                stack.append(head)
                head = head.next
            head = None
            while stack:
                stack[-1].next = head
                head = stack.pop()
            return head
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
    assert sol.removeNodes(as_list([5,2,13,3,8])) == as_list([13,8])
    return


@app.cell
def __(as_list, sol):
    assert sol.removeNodes(as_list([1,1,1,1])) == as_list([1,1,1,1])
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
