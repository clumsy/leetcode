import marimo

__generated_with = "0.4.5"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 958](https://leetcode.com/problems/check-completeness-of-a-binary-tree)")
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
    from collections import deque
    return Optional, deque


@app.cell
def __(Optional, TreeNode, deque):
    class Solution2:
        def isCompleteTree(self, root: Optional[TreeNode]) -> bool:
            q = deque([root])
            while q[-1]:
                cur = q.pop()
                q.appendleft(cur.left)
                q.appendleft(cur.right)
            while q and not q[-1]:
                q.pop()
            res = not q
            return res
    return Solution2,


@app.cell
def __(Optional, TreeNode):
    class Solution:
        def isCompleteTree(self, root: Optional[TreeNode]) -> bool:
            def dfs(node):
                if node is None:
                    return 0
                l, r = dfs(node.left), dfs(node.right)
                if l is None or r is None:
                    return None
                if (l & (l + 1) == 0 and l / 2 <= r <= l) or (r & (r + 1) == 0 and r <= l <= 2 * r + 1):
                    return 1 + l + r
                return None
            res = dfs(root)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(TreeNode, deque):
    null = None  # to use Leetcode samples as is

    def tree(values):
        if not values:
            return null
        queue = deque([(root := TreeNode(values[0])), None])
        length, i = len(values), 0
        while queue:
            current = queue.popleft()
            if current:
                i += 1
                if i < length and values[i] is not None:
                    current.left = TreeNode(values[i])
                    queue.append(current.left)
                i += 1
                if i < length and values[i] is not None:
                    current.right = TreeNode(values[i])
                    queue.append(current.right)
                if i == length:
                    return root
            else:
                if queue:
                    queue.append(None)
        return root
    return null, tree


@app.cell
def __(sol, tree):
    assert sol.isCompleteTree(tree([1,2,3,4,5,6]))
    return


@app.cell
def __(null, sol, tree):
    assert not sol.isCompleteTree(tree([1,2,3,4,5,null,7]))
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
