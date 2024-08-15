import marimo

__generated_with = "0.8.13"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2181](https://leetcode.com/problems/merge-nodes-in-between-zeros)""")
    return


@app.cell
def __():
    from typing import Optional
    return Optional,


@app.cell
def __():
    # Definition for singly-linked list.
    class ListNode:
        def __init__(self, val=0, next=None):
            self.val = val
            self.next = next
    return ListNode,


@app.cell
def __(ListNode, Optional):
    class Solution:
        def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
            cur = head;
            nxt = head.next
            while cur:
                while nxt and nxt.val:
                    cur.val += nxt.val
                    nxt = nxt.next
                    cur.next = nxt
                if cur.next and not cur.next.next:
                    cur.next = None
                cur = cur.next 
                nxt = cur.next if cur else None
            return head
    return Solution,


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
