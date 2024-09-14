import marimo

__generated_with = "0.8.20"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 234](https://leetcode.com/problems/palindrome-linked-list)""")
    return


@app.cell
def __():
    # Definition for singly-linked list.
    class ListNode:
        def __init__(self, val=0, next=None):
            self.val = val
            self.next = next
    return (ListNode,)


@app.cell
def __():
    from typing import Optional
    return (Optional,)


@app.cell
def __(ListNode, Optional):
    class Solution:
        def isPalindrome(self, head: Optional[ListNode]) -> bool:
            slow = fast = head
            nxt = prv = None
            while fast and fast.next:
                fast = fast.next.next
                prv, prv.next, slow = slow, prv, slow.next
            slow = slow.next if fast else slow
            while prv and prv.val == slow.val:
                slow, prv = slow.next, prv.next
            res = not prv
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
    assert sol.isPalindrome(as_list([1,2,2,1]))
    return


@app.cell
def __(as_list, sol):
    assert not sol.isPalindrome(as_list([1,2]))
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
