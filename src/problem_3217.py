import marimo

__generated_with = "0.7.5"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"[Problem 3217](https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array)")
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
    from typing import Optional, List
    return List, Optional


@app.cell
def __(List, ListNode, Optional):
    class Solution:
        def modifiedList(self, nums: List[int], head: Optional[ListNode]) -> Optional[ListNode]:
            nums = set(nums)
            head = cur = ListNode(next=head)
            while cur.next:
                if cur.next.val in nums:
                    cur.next = cur.next.next
                else:
                    cur = cur.next
            res = head.next
            return res
            
    return Solution,


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
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(as_list, sol):
    assert sol.modifiedList([1,2,3], as_list([1,2,3,4,5])) == as_list([4,5])
    return


@app.cell
def __(as_list, sol):
    assert sol.modifiedList([1], as_list([1,2,1,2,1,2])) == as_list([2,2,2])
    return


@app.cell
def __(as_list, sol):
    assert sol.modifiedList([5], as_list([1,2,3,4])) == as_list([1,2,3,4])
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
