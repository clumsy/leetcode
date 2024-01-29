import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2385](https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/description)")
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
    return TreeNode,


@app.cell
def __():
    from typing import Optional
    return Optional,


@app.cell
def __(Optional, TreeNode):
    class Solution:
        def amountOfTime(self, root: Optional[TreeNode], start: int) -> int:
            self.res = 0
            def dfs(node):
                if not node:
                    return 0
                lft = dfs(node.left)
                rgt = dfs(node.right)
                if lft < 0:
                    self.res = max(self.res, -lft + rgt)
                    return lft - 1
                elif rgt < 0:
                    self.res = max(self.res, -rgt + lft)
                    return rgt - 1
                down = max(lft, rgt)
                if node.val == start:
                    self.res = down
                    return -1
                return down + 1
            dfs(root)
            return self.res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


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
def __(null, sol, tree):
    assert sol.amountOfTime(tree([1,5,3,null,4,10,6,9,2]), 3) == 4
    return


@app.cell
def __(sol, tree):
    assert sol.amountOfTime(tree([1]), 1) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
