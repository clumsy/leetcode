import marimo

__generated_with = "0.9.4"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 2058](https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points)""")
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
    return (ListNode,)


@app.cell
def __():
    from typing import List, Optional
    from math import inf
    return List, Optional, inf


@app.cell
def __(List, ListNode, Optional, inf):
    class Solution:
        def nodesBetweenCriticalPoints(self, head: Optional[ListNode]) -> List[int]:
            f = p = None
            prv, head = head, head.next
            mi, i, ma = inf, 0, -inf
            while head.next:
                if head.next.val < head.val > prv.val or head.next.val > head.val < prv.val:
                    if f is not None:
                        ma = max(ma, i - f)
                    else:
                        f = i
                    if p is not None:
                        mi = min(mi, i - p)
                    p = i
                i += 1
                prv, head = head, head.next
            res = [mi if mi != inf else -1, ma if ma != -inf else -1]
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(ListNode):
    def as_list(vals):
        head = cur = ListNode()
        for i in vals:
            cur.next = ListNode(i)
            cur = cur.next
        return head.next
    return (as_list,)


@app.cell
def __(as_list, sol):
    assert sol.nodesBetweenCriticalPoints(as_list([3,1])) == [-1,-1]
    return


@app.cell
def __(as_list, sol):
    assert sol.nodesBetweenCriticalPoints(as_list([5,3,1,2,5,1,2])) == [1,3]
    return


@app.cell
def __(as_list, sol):
    assert sol.nodesBetweenCriticalPoints(as_list([1,3,2,2,3,2,2,2,7])) == [3,3]
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
