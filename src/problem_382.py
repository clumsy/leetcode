import marimo

__generated_with = "0.6.23"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(
        r"""
        [Problem 382](https://leetcode.com/problems/linked-list-random-node/description)
        """
    )
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
    import random
    from typing import Optional
    return Optional, random


@app.cell
def __(ListNode, Optional, random):
    class Solution:
        def __init__(self, head: Optional[ListNode]):
            self.head = head

        def getRandom(self) -> int:
            random.seed()
            cur, res = self.head.next, self.head.val
            n = 2  # k + 1 = 1 + 1 = 2
            while cur is not None:
                if random.randrange(n) == 0:
                    res = cur.val
                cur = cur.next
                n += 1
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
def __(Solution, as_list):
    sol = Solution(as_list([1, 2, 3]))
    assert 1 <= sol.getRandom() <= 3
    assert 1 <= sol.getRandom() <= 3
    assert 1 <= sol.getRandom() <= 3
    return sol,


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

