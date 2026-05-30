class Solution:
    def printTree(self, root: Optional[TreeNode]) -> List[List[str]]:
        def dfs_height(node):
            if node is None:
                return 0
            return 1 + max(dfs_height(node.left), dfs_height(node.right))

        height = dfs_height(root)
        n = 2**height - 1
        res = [[""] * n for _ in range(height)]

        def dfs_fill(node, r, c):
            if node is None:
                return
            res[r][c] = str(node.val)
            dfs_fill(node.left, r + 1, c - 2 ** (height - 1 - r - 1))
            dfs_fill(node.right, r + 1, c + 2 ** (height - 1 - r - 1))

        dfs_fill(root, 0, (n - 1) // 2)
        return res
