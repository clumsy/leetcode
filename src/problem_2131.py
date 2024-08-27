import marimo

__generated_with = "0.8.15"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("""[Problem 2131](https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list)""")
    return


@app.cell
def __():
    from typing import List, Optional
    return List, Optional


@app.cell
def __():
    class ListNode:
        def __init__(self, val=0, next=None):
            self.val = val
            self.next = next
    return ListNode,


@app.cell
def __(ListNode, Optional):
    class Solution:
        def pairSum(self, head: Optional[ListNode]) -> int:
            slow = fast = head
            while fast and fast.next:
                slow = slow.next
                fast = fast.next.next
            current, tail = (slow, None)
            while current:
                current.next, tail, current = (tail, current, current.next)
            res = 0
            while head and tail:
                res = max(res, head.val + tail.val)
                head, tail = (head.next, tail.next)
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
    assert sol.pairSum(as_list([5,4,2,1])) == 6
    return


@app.cell
def __(as_list, sol):
    assert sol.pairSum(as_list([4,2,2,3])) == 7
    return


@app.cell
def __(as_list, sol):
    assert sol.pairSum(as_list([1,100000])) == 100001
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
