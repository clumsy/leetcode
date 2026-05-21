class Solution:
    def tree2str(self, root: Optional[TreeNode]) -> str:
        res = []

        def dfs(node):
            if node is None:
                return
            res.append(str(node.val))
            if node.left is not None or node.right is not None:
                res.append("(")
                dfs(node.left)
                res.append(")")
            if node.right is not None:
                res.append("(")
                dfs(node.right)
                res.append(")")

        dfs(root)
        res = "".join(res)
        return res
