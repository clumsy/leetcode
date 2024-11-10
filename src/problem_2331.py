import marimo

__generated_with = "0.9.17"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2331](https://leetcode.com/problems/evaluate-boolean-binary-tree)""")
    return


@app.cell
def __():
    from typing import Optional
    return (Optional,)


@app.cell
def __():
    # Definition for a binary tree node.
    class TreeNode:
        def __init__(self, val=0, left=None, right=None):
            self.val = val
            self.left = left
            self.right = right
    return (TreeNode,)


@app.cell
def __(Optional, TreeNode):
    class Solution:
        def evaluateTree(self, root: Optional[TreeNode]) -> bool:
            st = []
            res = root
            while True:
                while root:
                    if root.right:
                        st.append(root.right)
                    st.append(root)
                    root = root.left
                root = st.pop()
                if root.right is not None and st and root.right == st[-1]:
                    # process right before root
                    st.pop()
                    st.append(root)
                    root = root.right
                else:
                    print(root.val)
                    root.val = (
                        root.val == 1 if root.left is None and root.right is None else 
                        root.left.val or root.right.val if root.val == 2 else 
                        root.left.val and root.right.val
                    )
                    root = None
                if not st:
                    break
            res = res.val
            return res
    return (Solution,)


@app.cell
def __(Optional, TreeNode):
    class Solution_1:

        def evaluateTree(self, root: Optional[TreeNode]) -> bool:
            if root.val < 2:
                return root.val == 1
            if root.val == 2:
                return self.evaluateTree(root.left) or self.evaluateTree(root.right)
            return self.evaluateTree(root.left) and self.evaluateTree(root.right)
    return (Solution_1,)


@app.cell
def __(Solution_1):
    sol = Solution_1()
    return (sol,)


@app.cell
def __(TreeNode):
    from collections import deque
    null = None

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
                i = i + 1
                if i < length and values[i]:
                    current.left = TreeNode(values[i])
                    queue.append(current.left)
                i = i + 1
                if i < length and values[i]:
                    current.right = TreeNode(values[i])
                    queue.append(current.right)
                if i == length:
                    return root
            elif queue:
                queue.append(None)
        return root
    return deque, null, tree


@app.cell
def __(null, sol, tree):
    assert sol.evaluateTree(tree([2,1,3,null,null,0,1]))
    return


@app.cell
def __(sol, tree):
    assert not sol.evaluateTree(tree([0]))
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
