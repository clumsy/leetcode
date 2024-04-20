import marimo

__generated_with = "0.4.0"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2095](https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list)")
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
        def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
            if head.next is None:
                return None
            prev = slow = fast = head
            while fast and fast.next != None:
                prev, slow, fast = slow, slow.next, fast.next.next
            prev.next = slow.next
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
    assert sol.deleteMiddle(as_list([1,3,4,7,1,2,6])) == as_list([1,3,4,1,2,6])
    return


@app.cell
def __(as_list, sol):
    assert sol.deleteMiddle(as_list([1,2,3,4])) == as_list([1,2,4])
    return


@app.cell
def __(as_list, sol):
    assert sol.deleteMiddle(as_list([2,1])) == as_list([2])
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
