import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2415](https://leetcode.com/problems/reverse-odd-levels-of-binary-tree)")
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
def __(Optional, TreeNode, deque):
    class Solution:
        def reverseOddLevels(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
            res, l, st = root, 0, deque([root])
            while st:
                n = len(st)
                if l & 1 == 1:
                    for i in range(n // 2):
                        st[i].val, st[n - 1 - i].val = st[n - 1 - i].val, st[i].val
                for i in range(n):
                    node = st.pop()
                    if node.left:
                        st.appendleft(node.left)
                        st.appendleft(node.right)
                l += 1
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
def __(sol, tree):
    assert sol.reverseOddLevels(tree([2,3,5,8,13,21,34])) == tree([2,5,3,8,13,21,34])
    return


@app.cell
def __(sol, tree):
    assert sol.reverseOddLevels(tree([7,13,11])) == tree([7,11,13])
    return


@app.cell
def __(sol, tree):
    assert sol.reverseOddLevels(tree([0,1,2,0,0,0,0,1,1,1,1,2,2,2,2])) == tree([0,2,1,0,0,0,0,2,2,2,2,1,1,1,1])
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
