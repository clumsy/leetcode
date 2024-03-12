import marimo

__generated_with = "0.3.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1080](https://leetcode.com/problems/insufficient-nodes-in-root-to-leaf-paths)")
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
    class Solution2:
        def sufficientSubset(self, root: Optional[TreeNode], limit: int) -> Optional[TreeNode]:
            def dfs(node, s=0):
                if node is None:
                    return s
                s += node.val
                lft = dfs(node.left, s) if node.left else limit - 1 if node.right else s
                rgt = dfs(node.right, s) if node.right else limit - 1 if node.left else s
                if lft < limit and rgt < limit:
                    node.left = node.right = None
                    return lft
                elif lft < limit:
                    node.left = None
                    return rgt
                elif rgt < limit:
                    node.right = None
                    return lft
                return limit

            res = root if dfs(root) >= limit else None
            return res
    return Solution2,


@app.cell
def __(Optional, TreeNode):
    class Solution:
        def sufficientSubset(self, root: Optional[TreeNode], limit: int) -> Optional[TreeNode]:
            if root.left == root.right:
                return root if root.val >= limit else None
            if root.left:
                root.left = self.sufficientSubset(root.left, limit - root.val)
            if root.right:
                root.right = self.sufficientSubset(root.right, limit - root.val)
            res = root if root.left or root.right else None
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
    assert sol.sufficientSubset(tree([1,2,3,4,-99,-99,7,8,9,-99,-99,12,13,-99,14]), 1) == tree([1,2,3,4,null,null,7,8,9,null,14])
    return


@app.cell
def __(null, sol, tree):
    assert sol.sufficientSubset(tree([5,4,8,11,null,17,4,7,1,null,null,5,3]), 22) == tree([5,4,8,11,null,17,4,7,null,null,null,5])
    return


@app.cell
def __(null, sol, tree):
    assert sol.sufficientSubset(tree([1,2,-3,-5,null,4,null]), -1) == tree([1,null,-3,4])
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
