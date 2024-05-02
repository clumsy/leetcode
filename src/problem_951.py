import marimo

__generated_with = "0.4.10"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 951](https://leetcode.com/problems/flip-equivalent-binary-trees)")
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
        def flipEquiv(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> bool:
            if root1 is None or root2 is None:
                return root1 == root2
            if root1.val != root2.val:
                return False
            res = (
                (self.flipEquiv(root1.left, root2.left) and self.flipEquiv(root1.right, root2.right)) or # no/both flip
                (self.flipEquiv(root1.right, root2.left) and self.flipEquiv(root1.left, root2.right)) or # flip root1
                (self.flipEquiv(root1.left, root2.right) and self.flipEquiv(root1.right, root2.left)) # flip root2
            )
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
    return deque, null, tree


@app.cell
def __(null, sol, tree):
    assert sol.flipEquiv(tree([1,2,3,4,5,6,null,null,null,7,8]), tree([1,3,2,null,6,4,5,null,null,null,null,8,7]))
    return


@app.cell
def __(sol, tree):
    assert sol.flipEquiv(tree([]), tree([]))
    return


@app.cell
def __(sol, tree):
    assert not sol.flipEquiv(tree([]), tree([1]))
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
