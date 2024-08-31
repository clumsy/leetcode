import marimo

__generated_with = "0.8.15"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2196](https://leetcode.com/problems/create-binary-tree-from-descriptions)""")
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
    from typing import Optional, List
    return List, Optional


@app.cell
def __(List, Optional, TreeNode):
    class Solution:
        def createBinaryTree(self, descriptions: List[List[int]]) -> Optional[TreeNode]:
            nodes, clds = {}, set()
            for pnt, cld, lft in descriptions:
                p, c = nodes.setdefault(pnt, TreeNode(pnt)), nodes.setdefault(cld, TreeNode(cld))
                clds.add(cld)
                if lft:
                    p.left = c
                else:
                    p.right = c
            res = nodes[(set(nodes) - clds).pop()]
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
    assert sol.createBinaryTree([[20,15,1],[20,17,0],[50,20,1],[50,80,0],[80,19,1]]) == tree([50,20,80,15,17,19])
    return


@app.cell
def __(null, sol, tree):
    assert sol.createBinaryTree([[1,2,1],[2,3,0],[3,4,1]]) == tree([1,2,null,null,3,4])
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
