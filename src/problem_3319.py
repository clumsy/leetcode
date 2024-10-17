import marimo

__generated_with = "0.9.10"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3319](https://leetcode.com/problems/k-th-largest-perfect-subtree-size-in-binary-tree)""")
    return


@app.cell
def __():
    # Definition for a binary tree node.
    class TreeNode:
        def __init__(self, val=0, left=None, right=None):
            self.val = val
            self.left = left
            self.right = right

        def __eq__(self, other):
            return other and self.val == other.val and self.left == other.left and self.right == other.right
    return (TreeNode,)


@app.cell
def __():
    from typing import Optional
    from heapq import heappush, heappushpop
    return Optional, heappush, heappushpop


@app.cell
def __(Optional, TreeNode, heappush, heappushpop):
    class Solution:
        def kthLargestPerfectSubtree(self, root: Optional[TreeNode], k: int) -> int:
            h = []
            def solve(cur):
                if cur is None:
                    return 0
                lft, rgt = solve(cur.left), solve(cur.right)
                if lft == rgt >= 0:
                    v = 2 * lft + 1
                    heappushpop(h, v) if len(h) == k else heappush(h, v)
                    return v
                return -1

            solve(root)
            res = h[0] if len(h) == k else -1
            return res
    return (Solution,)


@app.cell
def __(TreeNode):
    from collections import deque

    null = None  # to use Leetcode samples as is

    def tree(values):
        if not values:
            return null
        root = TreeNode(values[0])
        queue = deque()
        queue.append(root)
        queue.append(None)
        length = len(values)
        i = 0
        while queue:
            current = queue.popleft()
            if current:
                i += 1
                if i < length and values[i]:
                    current.left = TreeNode(values[i])
                    queue.append(current.left)
                i += 1
                if i < length and values[i]:
                    current.right = TreeNode(values[i])
                    queue.append(current.right)
                if i == length:
                    return root
            else:
                if queue:
                    queue.append(None)
        return root
    return deque, null, tree


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(null, sol, tree):
    assert sol.kthLargestPerfectSubtree(tree([5,3,6,5,2,5,7,1,8,null,null,6,8]), 2) == 3
    return


@app.cell
def __(sol, tree):
    assert sol.kthLargestPerfectSubtree(tree([1,2,3,4,5,6,7]), 1) == 7
    return


@app.cell
def __(null, sol, tree):
    assert sol.kthLargestPerfectSubtree(tree([1,2,3,null,4]), 3) == -1
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
