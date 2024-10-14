import marimo

__generated_with = "0.9.9"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2326](https://leetcode.com/problems/spiral-matrix-iv)""")
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
    from typing import Optional, List
    return List, Optional


@app.cell
def __(List, ListNode, Optional):
    class Solution:
        def spiralMatrix(self, m: int, n: int, head: Optional[ListNode]) -> List[List[int]]:
            res, stop = [[-1] * n for _ in range(m)], head is None
            for d in range(0, (m + 1) // 2):
                if stop: break
                for c in range(d, n - d - (m - d - 1 > d)):
                    if stop: break
                    res[d][c] = head.val
                    head = head.next
                    stop = head is None
                for r in range(d, m - d - 1):
                    if stop: break
                    res[r][n - d - 1] = head.val
                    head = head.next
                    stop = head is None
                for c in range(d + 1, n - d)[::-1]:
                    if stop: break
                    res[m - d - 1][c] = head.val
                    head = head.next
                    stop = head is None
                for r in range(d + 1, m - d)[::-1]:
                    if stop: break
                    res[r][d] = head.val
                    head = head.next
                    stop = head is None
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
    assert sol.spiralMatrix(3, 5, as_list([3,0,2,6,8,1,7,9,4,2,5,5,0])) == [[3,0,2,6,8],[5,0,-1,-1,1],[5,2,4,9,7]]
    return


@app.cell
def __(as_list, sol):
    assert sol.spiralMatrix(1, 4, as_list([0,1,2])) == [[0,1,2,-1]]
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
