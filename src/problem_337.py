import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 337](https://leetcode.com/problems/house-robber-iii)")
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
        def rob(self, root: Optional[TreeNode]) -> int:
            def dfs(node):
                if node is None:
                    return 0, 0
                lnxt, ldwn = dfs(node.left)
                rnxt, rdwn = dfs(node.right)
                nxt, dwn = node.val + ldwn + rdwn, max(lnxt, ldwn) + max(rnxt, rdwn)
                return nxt, dwn
            res = max(dfs(root))
            return res
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
    assert sol.rob(tree([3,2,3,null,3,null,1])) == 7
    return


@app.cell
def __(null, sol, tree):
    assert sol.rob(tree([3,4,5,1,3,null,1])) == 9
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
