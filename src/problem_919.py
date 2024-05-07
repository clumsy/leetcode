import marimo

__generated_with = "0.4.10"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 919](https://leetcode.com/problems/complete-binary-tree-inserter)")
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
    class CBTInserter2:

        def __init__(self, root: Optional[TreeNode]):
            self.root = root
            self.last = [root]

        def insert(self, val: int) -> int:
            nxt = []
            for node in self.last:
                if node.left is None:
                    node.left = TreeNode(val)
                    return node.val
                if node.right is None:
                    node.right = TreeNode(val)
                    return node.val
                nxt.append(node.left)
                nxt.append(node.right)
            self.last = nxt
            return self.insert(val)


        def get_root(self) -> Optional[TreeNode]:
            return self.root
    return CBTInserter2,


@app.cell
def __(TreeNode):
    class CBTInserter:

        def __init__(self, root):
            self.tree = [root]
            for i in self.tree:
                if i.left: self.tree.append(i.left)
                if i.right: self.tree.append(i.right)

        def insert(self, v):
            n = len(self.tree)
            self.tree.append(TreeNode(v))
            parent = self.tree[(n - 1) // 2]
            if n % 2:
                parent.left = self.tree[-1]
            else:
                parent.right = self.tree[-1]
            return parent.val

        def get_root(self):
            return self.tree[0]
    return CBTInserter,


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
def __(CBTInserter, tree):
    sol = CBTInserter(tree([1, 2]))
    sol.insert(3)
    sol.insert(4)
    assert sol.get_root() == tree([1, 2, 3, 4])
    return sol,


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
